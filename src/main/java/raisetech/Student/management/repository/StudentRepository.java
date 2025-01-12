package raisetech.Student.management.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.Student.management.data.Student;
import raisetech.Student.management.data.StudentsCourses;

/**
 * 受講生情報を扱うリポジトリ。
 *
 * 全権検索や単一条件での検索、コース情報の検索が行えるクラスです。
 */


@Mapper
public interface StudentRepository {

 /**
  *
  * @return 全権検索した受講生情報の一覧
  */

 @Select("SELECT * FROM students")
 List<Student> search();


 @Select("SELECT * FROM students_courses")
 List<StudentsCourses>searchStudentsCourses();

 @Select("SELECT * FROM students WHERE age BETWEEN 30 AND 39")
 List<Student> searchStudentsIn30s();

 @Select("SELECT * FROM students_courses WHERE course_name = 'Java'")
 List<StudentsCourses> searchJavaCourses();
}

