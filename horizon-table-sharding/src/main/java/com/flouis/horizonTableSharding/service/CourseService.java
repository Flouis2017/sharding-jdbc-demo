package com.flouis.horizonTableSharding.service;

import com.flouis.horizonTableSharding.entity.Course;
import com.flouis.horizonTableSharding.mapper.CourseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CourseService {

    @Resource
    private CourseMapper courseMapper;

    public Course findById(Long id) {
        return this.courseMapper.selectById(id);
    }

    public void update(Course course) {
        this.courseMapper.updateById(course);
    }

    public void add(Course course) {
        this.courseMapper.insert(course);
    }
}
