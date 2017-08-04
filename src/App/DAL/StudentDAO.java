package App.DAL;

import App.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student, Long>{
}
