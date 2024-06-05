package peaksoft.service.serviceImpl;

import peaksoft.model.Course;
import peaksoft.service.CourseService;

public class CourseServiceImpl implements CourseService {
    private Course[] courses = new Course[10];
    private int courseCount = 0;

    @Override
    public String addCourse(Course course) {
        courses[courseCount++] = course;
        return "course add" + course;
    }


    @Override
    public Course getCourseById(Long courseId) {
        for (Course course : courses) {
            if (course.getId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    @Override
    public void allCourse() {
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i]);
        }
    }

    @Override
    public String updateCourse(Long courseId, Course newCourse) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getId().equals(courseId)) {
                courses[i] = newCourse;
                return "Course updated!" + newCourse;
            }
        }
        return "Course no found!";
    }

    @Override
    public String deleteCourseById(Long courseId) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getId().equals(courseId)) {
                for (int j = 0; j < courseCount - 1; j++) {
                    courses[i] = courses[j + 1];
                }
                courseCount--;
                return "Course deleted!";
            }
        }
        return "Course not found!";
    }
}
