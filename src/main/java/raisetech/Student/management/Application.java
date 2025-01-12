package raisetech.Student.management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import raisetech.Student.management.data.Student;
import raisetech.Student.management.data.StudentsCourses;
import raisetech.Student.management.repository.StudentRepository;

@SpringBootApplication

public class Application {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
