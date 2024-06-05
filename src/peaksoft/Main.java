package peaksoft;

import peaksoft.enums.StudyFormat;
import peaksoft.model.Course;
import peaksoft.service.CourseService;
import peaksoft.service.serviceImpl.CourseServiceImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)  {
        Course course1 = new Course(1L,"Java","Description1",
                LocalDate.of(2024,4,1), StudyFormat.ONLINE);

        Course course2 = new Course(2L,"JS","Description2",
                LocalDate.of(2024,4,1), StudyFormat.OFFLINE);

        Course course3 = new Course(3L,"Flutter","Description3",
                LocalDate.of(2024,4,1), StudyFormat.ONLINE);

        CourseService courseService = new CourseServiceImpl();


//        ADD course
        System.out.println(courseService.addCourse(course1));
        System.out.println(courseService.addCourse(course2));
        System.out.println(courseService.addCourse(course3));

//        Get by id
        System.out.println("Get by id Course : ");
        System.out.println(courseService.getCourseById(2L));

//        Get all Courses
        System.out.println("All courses : ");
        courseService.allCourse();

//        Update course
        System.out.println("Update course : ");
        Course newCourse = new Course(3L,"Python","Description3",
                LocalDate.of(2024,6,1),StudyFormat.ONLINE);
        System.out.println(courseService.updateCourse(3L, newCourse));

//        Delete course
        System.out.println("Delete course: ");
        System.out.println(courseService.deleteCourseById(1L));

        System.out.println("All course after deleted: ");
        courseService.allCourse();

    }
}