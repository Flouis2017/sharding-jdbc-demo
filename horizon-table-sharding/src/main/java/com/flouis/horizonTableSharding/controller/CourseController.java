package com.flouis.horizonTableSharding.controller;

import com.alibaba.fastjson.JSONObject;
import com.flouis.horizonTableSharding.entity.Course;
import com.flouis.horizonTableSharding.service.CourseService;
import com.flouis.horizonTableSharding.util.ResUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;

    @GetMapping("/{id}")
    public JSONObject findById(@PathVariable Long id) {
        Course course = this.courseService.findById(id);
        JSONObject res = ResUtil.response();
        res.put("data", course);
        return res;
    }

    @PutMapping
    public JSONObject update(@RequestBody Course course) {
        this.courseService.update(course);
        return ResUtil.response();
    }

    @PostMapping
    public JSONObject add(@RequestBody Course course) {
        this.courseService.add(course);
        JSONObject res = ResUtil.response();
        res.put("data", course);
        return res;
    }

}
