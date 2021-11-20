package com.flouis.horizonTableSharding;

import com.flouis.horizonTableSharding.entity.Course;
import com.flouis.horizonTableSharding.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class SpringApplicationTest {

    @Resource
    private CourseMapper courseMapper;

    @Test
    public void shardingInsertTest() {
        Course course = new Course();
        /*for (int i = 1; i <= 10; i++) {
            course.setId(null);
            course.setCsName("Java-" + i);
            course.setState(1);
            this.courseMapper.insert(course);
        }*/
        /*for (int i = 1; i <= 10; i++) {
            course.setId(null);
            course.setCsName("Golang-" + i);
            course.setState(1);
            this.courseMapper.insert(course);
        }*/
        /*for (int i = 1; i <= 10; i++) {
            course.setId(null);
            course.setCsName("JS-" + i);
            course.setState(1);
            this.courseMapper.insert(course);
        }*/
        for (int i = 1; i <= 10; i++) {
            course.setId(null);
            course.setCsName("Python-" + i);
            course.setState(1);
            this.courseMapper.insert(course);
        }
    }

}
