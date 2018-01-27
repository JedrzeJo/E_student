package com.java.project.studies;


import java.util.Scanner;

public class student {
    Scanner scanner=new Scanner(System.in);
    String name;
    String surname;
    Long student_ID;
    boolean student_status=true;

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
        if(this.student_status = true) { this.student_status = false; }
        else{this.student_status=true;}
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

    public student() {
        this.name = scanner.nextLine();
        this.surname = scanner.nextLine();
        this.student_ID = scanner.nextLong();
    }

    public boolean getStudent_status() {
        return student_status;
    }
}
