package ru.torogeldi.springcourse;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
public class Java implements Programing {


    @Override
    public String toString() {
        return "Java{";

    }

    public void getAllCourse() {
        System.out.println("Java...");
    }
}
