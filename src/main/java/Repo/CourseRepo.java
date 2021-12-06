package Repo;

import Uni.Course;
import Uni.ICrudRepository;
import Uni.IMemoryRepository;
import java.sql.*;
import java.util.List;

public class CourseRepo implements ICrudRepository<Course> {
    private List<Course> courseList;

    public CourseRepo(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course create(Course obj) {
        return null;
    }

    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public Course update(Course obj) {
        return null;
    }

    @Override
    public void delete(Course obj) {

    }
}
