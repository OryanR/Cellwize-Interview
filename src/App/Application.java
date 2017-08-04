package App;

import App.DAL.CourseDAO;
import App.DAL.EnrollmentDAO;
import App.DAL.StudentDAO;
import App.Models.Enrollment;
import App.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner{

    @Autowired
    CourseDAO courseDAO;
    @Autowired
    EnrollmentDAO enrollmentDAO;
    @Autowired
    StudentDAO studentDAO;

    public static void main (String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//        Student student = new Student(new Long(999), "oryan", "ra", new Long(321), "male");
//        studentDAO.save(student);
        Enrollment enrollment = new Enrollment(new Long(999), new Long(123), 100);
        enrollmentDAO.save(enrollment);
    }

}
