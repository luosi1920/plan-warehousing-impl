package com.yibai.plan.warehousing.service.local;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @description: svnNew
 * @author: zxf
 * @create: 2019-03-11 11:20
 **/
public class CreatePrList extends TimerTask {
    //处理具体的业务逻辑
    public void  run (){

    }
    //生成需求订单号
    public String  getPrNo(){
        StringBuffer prno=new StringBuffer("HSS");
        String createDate=  getCreateDate();
        String year= createDate.substring(2,4);
        String month=createDate.substring(5,7);
        String day=createDate.substring(8,10);
        String str = "";
        //随机生成两个字母
        for (int i = 0;i<2;i++){
            str = str+ (char)(Math.random()*26+'A');
        }

        //随机5位数
        int  num=(int )((Math.random()*9+1)*10000);
        prno.append(year).append(month).append(day).append(str).append(num);
        return prno.toString();
    }
    //获取系统当前时间 精确到时分秒
    public String  getCreateDate() {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sysdate= df.format(new Date());
        return sysdate;
    }
    //获取一次备货天数
    public Integer   getStockDay(){
        Integer  res=0;
        String createDate=  getCreateDate();
        String month=createDate.substring(5,7);
        if("05".equals(month)||"11".equals(month)){
            res= 30;
        }else{
            res= 15;
        }
        return res;
    }

    //备货提前期=备货处理周期+供货周期+打包时效+物流时效+上架时效+缓冲库存
    public Integer leadTimeStock(){
       return null;
     }



    /**
     * @param list 28天每天的销量的集合
     * @return
     */
    //获取28天销量平均值
    public BigDecimal getAvgPcs(List<Integer > list){
        //list求和
        Double sum= list.stream().mapToDouble(Integer::doubleValue).sum();
        int size=list.size();
        int divedend=size-1;
        BigDecimal result=new BigDecimal(0);
        BigDecimal bigDecimalsum=new BigDecimal(sum);
        //28天销量平均值
        BigDecimal avg= bigDecimalsum.divide(new BigDecimal(size),9,BigDecimal.ROUND_HALF_UP);

        return avg;
    }



    /**
     * @param list 每天销量的集合
     * @return
     */
    //计算28天销量偏差值    跟计算28天交付偏差值可以共用
    public Double calSalesDiscrepancyBy28Day( List<Integer > list){
        //list= Arrays.asList(5,3,8,2,9,7,3,12,5,6,3,4,9,2,11,3,8,6,7,6,2,12,9,4,6,3,8,7);
        BigDecimal result=new BigDecimal(0);
        //28天销量平均值
        BigDecimal avg=getAvgPcs(list);
        for(Integer st:list  ){
            BigDecimal mm=  new BigDecimal(st).subtract(avg).pow(2);
            result=result.add(mm);
        }
        BigDecimal diveResult= result.divide(new BigDecimal(list.size()-1),7,BigDecimal.ROUND_HALF_UP);
        Double res= Math.sqrt(diveResult.doubleValue());
        System.out.println(res);//2.9929370190500166
        System.out.println(res);
        return res;
    }

    /**
     * @param list 28天每天交付的数量的集合
     * @return
     */
    //计算28天交付偏差值
    public Double calPayDiscrepancyBy28Day(List<Integer > list){

        return  calSalesDiscrepancyBy28Day(list);
    }

    /**
     * @param leadTimeStock 备货提前期
     * @param calSalesDiscrepancy 28天销量偏差值
     * @param avg 28天销量平均值
     * @param calPayDiscrepancy 28天交付偏差值
     * @param z 服务值
     * @return
     */
    //安全库存
    public Integer getSafeStock(BigDecimal leadTimeStock,BigDecimal calSalesDiscrepancy,
                                BigDecimal avg,BigDecimal calPayDiscrepancy,BigDecimal z){
        BigDecimal avgSquare=avg.pow(2);
        BigDecimal calPaySquare=calPayDiscrepancy.pow(2);
        Double dou=avgSquare.multiply(calPaySquare).add(calSalesDiscrepancy.pow(2).multiply(leadTimeStock)).doubleValue();
        //求平方根
        Double sqrt=Math.sqrt(dou);
        String result=new BigDecimal(sqrt).multiply(z).setScale(0,BigDecimal.ROUND_HALF_UP).toString();
        return Integer.valueOf(result);
    }

    /**
     * @param leadTimeStock 备货提前期
     * @param avg  28天销量平均值
     * @param safeStock  安全库存
     * @return
     */
    //获取订购点 订购点=（28天销量平均值*备货提前期）+安全库存 OrderQuantity
    public  Integer getOrderPoint(BigDecimal leadTimeStock,BigDecimal avg,BigDecimal safeStock){
        String result=avg.multiply(leadTimeStock).add(safeStock).toString();
        return  Integer.valueOf(result);
    }

    /**
     * @param avg 28天销量平均值
     * @param stockDay 一次备货数量
     * @return
     */
    ////订购数量=28天日均销量*一次备货天数
    public Integer getOrderQuantity(BigDecimal avg,BigDecimal stockDay){
        String orderQuantity=avg.multiply(stockDay).toString();
        return Integer.valueOf(orderQuantity);
    }

    /**
     * @param orderPoint 订购点
     * @param orderQuantity 订购数量
     * @param subQuantity 要减去的数量（可用库存+待上架+国际在途）
     * @param bd 上一天审核通过的需求数量
     * @return
     */

    //需求数量=订购点+订购数量-（可用库存+待上架+国际在途）+BD-上一天审核通过的需求数量
    public Integer getDemandQuantity(Integer orderPoint,Integer orderQuantity,
                                     Integer subQuantity,Integer bd ){
        Integer res=orderPoint+orderQuantity-subQuantity+bd;
        return res;
    }
    /**
     * @param totalStock （FBA可用库存+FBA待上架数+FBA国际在途数量）
     * @param avg
     * @return
     */
    //可支撑天数=（FBA可用库存+FBA待上架数+FBA国际在途数量）/28天日均销量
    //获取可支撑天数
    public Integer  getSupportableDays( BigDecimal totalStock,BigDecimal avg){
        //向下取整
        String day= totalStock.divide(avg,BigDecimal.ROUND_HALF_DOWN).toString();
        return Integer.valueOf(day);
    }
    /**
     * @param supportableDays 可支撑天数
     * @return
     */
    //缺货时间=生成时间+可支撑天数
    public Date getShortageTime(Integer supportableDays){
        Date date =new Date();
        Calendar startDT = Calendar.getInstance();
        startDT.setTime(date);
        startDT.add(Calendar.DAY_OF_MONTH, supportableDays);
        /*SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String sysdate= df.format(startDT.getTime());*/
        return startDT.getTime();
    }

  /*  每日销量去掉极大值及极小值，根据如下逻辑计算
  （1）如果SKU销量>=15天，计算公式如下：过去7天日均销量*0.5+过去14天日均销量*0.3+过去28天日均销量*0.2（去掉极值，不包含“0”）；
  （2）如果SKU销量<15天，计算一次指数平滑预测，公式如下：St=a*yt+(1-a)*St-1 St--时间t的平滑值；yt--时间t的实际值；　　
      St-1--时间t-1的平滑值；a--平滑常数，其取值范围为[0,1]
     （加权销量一期不做使用，所有的日均销量都直接用销量平均值）*/
    /**
     * @param list
     * @return
     */
    public Double getWeightSalePcs(List<Integer > list){
        BigDecimal start=new BigDecimal(0);
        if(list.size()<15){
            for(Integer lst:list  ){
                start=new BigDecimal(lst).add(start).divide(new BigDecimal(2),2,BigDecimal.ROUND_HALF_UP);
            }
        }else{
            Collections.reverse(list);
            List new7List = list.subList(0, 7);
            List new14List = list.subList(0, 7);
            start=getAvgPcs(new7List).multiply(new BigDecimal(0.5)).add(getAvgPcs(new7List).multiply(new BigDecimal(0.3)))
                    .add(getAvgPcs(list).multiply(new BigDecimal(0.2)));
        }
       return start.setScale(0,BigDecimal.ROUND_HALF_UP).doubleValue();
     }

    /**
     * @param totalStock (可用库存+待上架+在途)
     * @param safeStock   安全库存
     * @param OrderPoint  订购点为
     * @return
     */
    //是否触发需求  IF 可用库存+待上架+在途+安全库存<订购点为“Y” 反之为“N”
    public String isTriggerPr(Integer totalStock,Integer safeStock,Integer OrderPoint){
        Integer total=totalStock+safeStock;
        if(total<OrderPoint){
            return "Y";
        }else{
            return "N";
        }
    }

    /**
     * @param bd
     * @return
     */
    //是否触发审核 若BD>0，就要触发计划审核，“Y”，否则为“N”
    public String isTriggerExamine(Integer bd){
        if(bd>0){
            return "Y";
        }else{
            return "N";
        }
    }
    /*审核状态 新增的数据默认待一级审核，BD修改完毕，进入一级审核，若不触发计划审核，
    则审核通过就开始生成备货单，若触发计划审核，则需要二级三级操作人员审核通过，审核失败的重新通过BD修改提交为待审核*/
    //一条记录当天未审核通过的都变为过期
}
