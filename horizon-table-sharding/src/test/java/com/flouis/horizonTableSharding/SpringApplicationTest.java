package com.flouis.horizonTableSharding;

import com.flouis.horizonTableSharding.entity.Course;
import com.flouis.horizonTableSharding.entity.TestUser;
import com.flouis.horizonTableSharding.mapper.CourseMapper;
import com.flouis.horizonTableSharding.mapper.TestUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class SpringApplicationTest {

    @Resource
    private CourseMapper courseMapper;

    @Resource
    private TestUserMapper testUserMapper;

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

    @Test
    public void testUserInsertTest() {
        TestUser testUser = new TestUser();
        for (int i = 1; i <= 10; i++) {
            testUser.setId(null);
            testUser.setTheName("No." + i);
            testUser.setGender((int) System.currentTimeMillis() % 2);
            this.testUserMapper.insert(testUser);
        }
    }

}
