package com.yibai.plan.warehousing;

import com.yibai.plan.warehousing.configuration.datasource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
@Import(DynamicDataSourceRegister.class)
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yibai.plan.warehousing.dao.mapper")
public class PlanWarehousingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlanWarehousingServiceApplication.class, args);
    }
}
