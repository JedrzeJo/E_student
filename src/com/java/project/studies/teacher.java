package com.company.jedrzej.MyPg;

import java.util.Scanner;

public class teacher extends subject {
    private Scanner scanner=new Scanner(System.in);
    private String surname;
    private String education_degree="elementary school";
    private static int teacher_counter=0;

    public teacher() {
        System.out.println("Enter surname: ");
        this.surname = scanner.nextLine();
        //this.education_degree = scanner.nextLine();
        teacher_counter++;
    }

    public static int getTeacher_counter() {
        return teacher_counter;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation_degree() {
        return education_degree;
    }

    public void setSurname() {
        this.surname = scanner.nextLine();
    }

    public void setEducation_degree() {
        System.out.println("Enter degree name: ");
        this.education_degree = scanner.nextLine();
    }

    public void display_teacher_info(){
        System.out.println("Surname: "+this.surname+" Degree: "+this.education_degree);
    }
}
