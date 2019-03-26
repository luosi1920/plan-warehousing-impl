package com.yibai.plan.warehousing.service.rpc;

import com.yibai.plan.warehousing.dto.response.TestDataRespDTO;
import com.yibai.plan.warehousing.service.TestRemoteService;
import com.yibai.plan.warehousing.service.local.TestLocalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRemoteServiceImpl implements TestRemoteService {

    @Autowired
    private TestLocalServiceImpl testLocalService;

    @Override
    public String hello(String name) {
        return name+testLocalService.hello();
    }

    @Override
    public List<TestDataRespDTO> queryTestDataAll() {
        return testLocalService.queryTestDataAll();
    }
}
