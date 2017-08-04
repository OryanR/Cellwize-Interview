package App.DAL;

import App.Models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentDAO extends JpaRepository<Enrollment, Long> {
}
