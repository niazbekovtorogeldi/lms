package ru.torogeldi.springcourse;

import lombok.*;
import org.springframework.stereotype.Component;


@
Getter
@Setter
@ToString
public class Js implements Programing {
    public void getAllCourse() {
        System.out.println("JavaScript...");
    }

    @Override
    public String toString() {
        return "Js{}";
    }
}
