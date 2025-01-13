package raisetech.Student.management.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.Student.management.data.Student;
import raisetech.Student.management.data.StudentsCourses;
import raisetech.Student.management.service.StudentService;

@RestController
public class StudentController {

  private StudentService service;


@Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  @GetMapping("studentList")
  public List<Student> searchStudentList() {
    return service.searchStudentList();

  }

  @GetMapping("studentsCourseList")
  public List<StudentsCourses> searchStudentsCoursesList() {
    return service.searchStudentsCoursesList();
  }

  @GetMapping("studentIn30sList")
  public List<Student> searchStudentsIn30s() {
    return service.searchStudentsIn30sList();

  }

  @GetMapping("JavaCoursesList")
  public List<StudentsCourses> searchJavaCoursesList() {
    return service.searchJavaCoursesList();
  }
}
