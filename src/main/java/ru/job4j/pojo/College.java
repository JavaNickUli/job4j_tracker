package ru.job4j.pojo;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroup("17-МИ");
        student.setCreated(new Date());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(student.getFullName() + " зачислен в группу " + student.getGroup()
                + ".\n" + student.getCreated());
    }
}
