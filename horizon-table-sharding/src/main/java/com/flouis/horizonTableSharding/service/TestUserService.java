package com.flouis.horizonTableSharding.service;

import com.flouis.horizonTableSharding.entity.TestUser;
import com.flouis.horizonTableSharding.mapper.TestUserMapper;
import com.flouis.horizonTableSharding.vo.TestUserSearchVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestUserService {

    @Resource
    private TestUserMapper testUserMapper;

    public TestUser findById(Long id) {
        return this.testUserMapper.selectById(id);
    }

    public Page<TestUser> findPage(TestUserSearchVo svo) {
        Page<TestUser> page = PageHelper.startPage(svo.getCurPage(), svo.getPageSize());
        this.testUserMapper.findPage(svo);
        return page;
    }

}
