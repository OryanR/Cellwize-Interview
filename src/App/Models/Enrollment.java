package App.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "enrollments")
public class Enrollment {

    private Long enrollment_id;
    private Long student_id;
    private Long course_id;
    private Integer grade;

    public Enrollment(){}

    public Enrollment(Long student_id, Long course_id, Integer grade){
        super();
        this.student_id = student_id;
        this.course_id = course_id;
        this.grade = grade;
    }

    @Id
    @GeneratedValue
    public Long getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(Long enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollment_id=" + enrollment_id +
                ", student_id=" + student_id +
                ", course_id=" + course_id +
                ", grade=" + grade +
                '}';
    }
}
