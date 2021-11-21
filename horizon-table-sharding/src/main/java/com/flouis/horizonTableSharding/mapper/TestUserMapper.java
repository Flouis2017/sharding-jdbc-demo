package com.flouis.horizonTableSharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.flouis.horizonTableSharding.entity.TestUser;
import com.flouis.horizonTableSharding.vo.TestUserSearchVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestUserMapper extends BaseMapper<TestUser> {

    List<TestUser> findPage(TestUserSearchVo svo);

}
