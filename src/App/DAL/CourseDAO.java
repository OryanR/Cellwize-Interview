package App.DAL;

import App.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDAO extends JpaRepository<Course, Long>{
}
