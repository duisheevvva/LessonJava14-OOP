package peaksoft.service;

import peaksoft.model.Course;

public interface CourseService {
//    TODO ALL CRUD Methods:
//    Create
    String addCourse(Course course);
//    Read
    Course getCourseById(Long courseId);
//    Read
    void allCourse();
//    Update
    String updateCourse(Long courseId,Course newCourse);
//    Delete
    String deleteCourseById(Long courseId);

}
