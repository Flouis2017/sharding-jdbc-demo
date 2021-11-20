package com.flouis.horizonTableSharding.service;

import com.flouis.horizonTableSharding.entity.TestUser;
import com.flouis.horizonTableSharding.mapper.TestUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestUserService {

    @Resource
    private TestUserMapper testUserMapper;

    public TestUser findById(Long id) {
        return this.testUserMapper.selectById(id);
    }
}
