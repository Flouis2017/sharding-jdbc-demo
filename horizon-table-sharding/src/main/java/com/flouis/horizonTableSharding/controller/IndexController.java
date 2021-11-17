package com.flouis.horizonTableSharding.controller;

import cn.hutool.json.JSONUtil;
import com.flouis.horizonTableSharding.dao.CourseDao;
import com.flouis.horizonTableSharding.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/index")
public class IndexController {

	@Resource
	private CourseDao courseDao;

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "hello " + name + "~";
	}

	@GetMapping("/course/{id}")
	public String getCourseJsonStr(@PathVariable Long id) {
		Course course = this.courseDao.selectByPrimaryKey(id);
		return JSONUtil.toJsonStr(course);
	}

}
