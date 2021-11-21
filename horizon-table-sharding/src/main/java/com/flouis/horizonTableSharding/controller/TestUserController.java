package com.flouis.horizonTableSharding.controller;

import com.alibaba.fastjson.JSONObject;
import com.flouis.horizonTableSharding.entity.TestUser;
import com.flouis.horizonTableSharding.service.TestUserService;
import com.flouis.horizonTableSharding.util.ResUtil;
import com.flouis.horizonTableSharding.vo.TestUserSearchVo;
import com.github.pagehelper.Page;
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

    @GetMapping("/page")
    public JSONObject findPage(TestUserSearchVo svo) {
        svo.preHandle();
        Page<TestUser> page = this.testUserService.findPage(svo);
        JSONObject data = new JSONObject();
        data.put("total", page.getTotal());
        data.put("list", page.getResult());
        JSONObject res = ResUtil.response();
        res.put("data", data);
        return res;
    }

}
