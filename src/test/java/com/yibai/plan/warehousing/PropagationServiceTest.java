package com.yibai.plan.warehousing;

import com.yibai.plan.warehousing.service.local.propagation.TestLocalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = PlanWarehousingServiceApplication.class)
public class PropagationServiceTest {



    @Autowired
    private TestLocalService testLocalService;

    @Test
    public void notransaction_exception_required_required() {
        testLocalService.notransaction_exception_required_required();
    }

    @Test
    public void notransaction_required_required_exception(){
        testLocalService.notransaction_required_required_exception();
    }

    @Test
    public void transaction_exception_required_required(){
        testLocalService.transaction_exception_required_required();
    }

    @Test
    public void transaction_required_required_exception(){
        testLocalService.transaction_required_required_exception();
    }

    @Test
    public void transaction_required_required_exception_try(){
        testLocalService.transaction_required_required_exception_try();
    }
}
