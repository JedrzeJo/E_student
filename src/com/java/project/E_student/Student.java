package com.java.project.E_student;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Student implements Savable {
    Scanner scanner=new Scanner(System.in);
    String name;
    String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Long student_ID;
    boolean student_status=true;
    private static int student_counter=0;

    public static int getStudent_counter() {
        return student_counter;
    }


    public void setName() {
        this.name = scanner.nextLine();
    }

    public void setSurname() {
        this.surname = scanner.nextLine();
    }

    public void setStudent_ID() {
        this.student_ID = scanner.nextLong();
    }

    public void Change_Student_status() {
        if(this.student_status = true) { this.student_status = false;
            System.out.println("Student suspended in student rights.");}
        else{this.student_status=true;
            System.out.println("Student status is active.");}

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getStudent_ID() {
        return student_ID;
    }

    public Student() {
        System.out.println("Type name, surname and ID: ");
        this.name = scanner.nextLine();
        this.surname = scanner.nextLine();
        this.student_ID = scanner.nextLong();
        student_counter++;
    }

    public void display_studnet_info(){
        System.out.println("Name: "+this.name+" Surname: "+this.surname+" ID: "+this.student_ID);
    }

    public boolean getStudent_status() {
        return student_status;
    }

    @Override
    public List<String> getDataToSave() {
        List<String> local=new LinkedList<>();
        local.add(this.name);
        local.add(this.surname);
        return local;
    }

    @Override
    public String getFileName() {
        return "Students.txt";
    }
}
