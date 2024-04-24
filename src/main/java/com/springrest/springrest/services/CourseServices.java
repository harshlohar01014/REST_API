package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseServices {

    public List<Course> getCourses();

    public Course getCourse(long courseId);


}
