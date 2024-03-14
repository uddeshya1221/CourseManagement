package controller;

//public class CourseController {

//}
//package com.example.demo.controller;

import domain.Course;
import repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @SuppressWarnings("null")
    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @SuppressWarnings("null")
    @PutMapping("/update/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course courseDetails) {
        Course course = courseRepository.findById(id)
                                        .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        // Update course attributes with courseDetails
        // Example: course.setName(courseDetails.getName());
        return courseRepository.save(course);
    }

    @GetMapping("/get")
    public List<Course> getCourses() {
        // Here you can fetch courses based on user's role
        return courseRepository.findAll();
    }
}

