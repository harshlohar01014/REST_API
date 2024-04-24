package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourceServiceImpl implements CourseServices {

    List<Course> list;

    public CourceServiceImpl(){

        list = new ArrayList<>();
        list.add(new Course(125, "Java Core Cource","This cource contains basics of java "));
        list.add(new Course(101,"SprinBoot","Creating rest api using spring boot"));

    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {

        Course c= null;
        for(Course course:list)
        {
         if(course.getId()==courseId)
            {
             c=course;
             break;
            }
        }
        return c;
    }
}
