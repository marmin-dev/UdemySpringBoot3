package com.marmin.springboot.learn_spring_boot_3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "kimkillwhan"),
                new Course(2, "Learn DevOps", "ParkSuckKill"),
                new Course(3, "Learn Azure", "Morgan Freeman"),
                new Course(4,"Learn Clean Code","Jeremy"),
                new Course(5,"Learn ECU","Scott"),
                new Course(6,"Learn hello", "Park")
        );
    }

}
