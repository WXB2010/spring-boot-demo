package com.wxb.springbootwxbshardingjdbc;

import com.wxb.springbootwxbshardingjdbc.entity.course;
import com.wxb.springbootwxbshardingjdbc.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringBootWxbShardingjdbcApplicationTests {

    @Resource
    private CourseMapper courseMapper;

    @Test
    void addCourse() {
        course course = new course();
        course.setCname("Java");
        course.setUserId(100L);
        course.setCstatus("normal");
        courseMapper.insert(course);
    }

}
