package raisetech.Student.management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.Student.management.data.Student;
import raisetech.Student.management.data.StudentsCourses;
import raisetech.Student.management.repository.StudentRepository;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }


  public List<Student> searchStudentList() {
    //ここで何かしらの処理を行う。

    return repository.search();
  }

  public List<StudentsCourses> searchStudentsCoursesList() {
    return repository.searchStudentsCourses();
  }

  public List<Student> searchStudentsIn30sList() {
    return repository.searchStudentsIn30s();
  }

  public List<StudentsCourses> searchJavaCoursesList() {
    return repository.searchJavaCourses();
  }
}
