package ru.torogeldi.springcourse;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private int duration;
    private int price;
    private List<Programing> programing;

    public Course(List<Programing> programing) {
        this.programing = programing;
    }

    public void getLanguage(){
        System.out.println(programing);
    }

    @Override
    public String toString() {
        return "Course{" +
                "duration=" + duration +
                ", price=" + price +
                ", programing=" + programing +
                '}';
    }
}
