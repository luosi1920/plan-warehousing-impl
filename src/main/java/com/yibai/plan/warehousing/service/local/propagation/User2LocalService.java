package com.yibai.plan.warehousing.service.local.propagation;

import com.yibai.plan.warehousing.dao.entity.User1;
import com.yibai.plan.warehousing.dao.entity.User2;
import com.yibai.plan.warehousing.dao.mapper.User1Mapper;
import com.yibai.plan.warehousing.dao.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class User2LocalService {

    @Autowired
    private User2Mapper user2Mapper;


    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public void addRequired(User2 user){
        user2Mapper.insert(user);
    }


    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public void addRequiredException(User2 user){
        user2Mapper.insert(user);
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiresNew(User2 user){
        user2Mapper.insert(user);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiresNewException(User2 user){
        user2Mapper.insert(user);
        throw new RuntimeException();
    }


}
