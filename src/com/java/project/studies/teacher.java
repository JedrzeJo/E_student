package com.java.project.studies;

import java.util.Scanner;

public class teacher extends subject {
    Scanner scanner=new Scanner(System.in);
    String surname;
    String education_degree;

    public teacher() {
        this.surname = scanner.nextLine();
        this.education_degree = scanner.nextLine();
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
        this.education_degree = scanner.nextLine();
    }
}
