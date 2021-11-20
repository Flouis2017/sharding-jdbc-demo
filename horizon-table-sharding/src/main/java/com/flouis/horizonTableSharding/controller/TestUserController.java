package com.flouis.horizonTableSharding.controller;

import com.alibaba.fastjson.JSONObject;
import com.flouis.horizonTableSharding.entity.TestUser;
import com.flouis.horizonTableSharding.service.TestUserService;
import com.flouis.horizonTableSharding.util.ResUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/testUser")
public class TestUserController {

    @Resource
    private TestUserService testUserService;

    @GetMapping("/{id}")
    public JSONObject findById(@PathVariable Long id) {
        JSONObject res = ResUtil.response();
        TestUser rec = this.testUserService.findById(id);
        res.put("data", rec);
        return res;
    }

}
