package App.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    // attributes
    private Long id;
    private String first_name;
    private String last_name;
    private Long city_id;
    private String gender;

    // constructors
    public Student(){}

    public Student(Long id, String first_name, String last_name, Long city_id, String gender){
        super();
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.city_id = city_id;
        this.gender = gender;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Long getCity_id() {
        return city_id;
    }

    public String getGender() {
        return gender;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", city_id=" + city_id +
                ", gender='" + gender + '\'' +
                '}';
    }
}
