package App.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

    private Long id;
    private String name;
    private Integer hours;
    private Integer difficulty;


    public Course(){}

    public Course(Long id, String name, Integer hours, Integer difficulty){
        super();
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.difficulty = difficulty;
    }


    @Id
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public Integer getDifficulty() {
        return difficulty;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", difficulty=" + difficulty +
                '}';
    }
}
