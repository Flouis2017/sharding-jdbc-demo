package com.flouis.horizonTableSharding.dao;


import com.flouis.horizonTableSharding.entity.Course;

public interface CourseDao {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);
}