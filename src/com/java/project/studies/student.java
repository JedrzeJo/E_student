package com.company.jedrzej.MyPg;


import java.util.Scanner;

public class student {
    Scanner scanner=new Scanner(System.in);
    String name;
    String surname;
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

    public student() {
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
}
