package com.java.project.E_student;

import java.util.Scanner;

public class Subject {
    private Scanner scanner=new Scanner(System.in);
    private String subject_name;
    private Degree subject_degree=Degree.One;
    private static int subject_counter=0;

    public void setSubject_name() {
        this.subject_name = scanner.nextLine();
    }

    public void display_Subject_name() {
        System.out.println("Subject name: "+this.subject_name);
    }

    public static int getSubject_counter() {
        return subject_counter;
    }

    public Subject() {
        System.out.println("Enter subject name: ");
        this.subject_name = scanner.nextLine();
        subject_counter++;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public Degree getSubject_degree() {
        return subject_degree;
    }

    public void setSubject_degree() {
        Integer deg=new Integer(scanner.nextInt());
        switch(deg) {
            case 1:
                this.subject_degree = Degree.One;
                break;
            case 2:
                this.subject_degree = Degree.Two;
                break;
            case 3:
                this.subject_degree = Degree.Three;
                break;
            case 4:
                this.subject_degree = Degree.Four;
                break;
            case 5:
                this.subject_degree = Degree.Five;
                break;
            default:
                throw new IllegalArgumentException("Degree out of range 1-5 !");
        }

    }
}
