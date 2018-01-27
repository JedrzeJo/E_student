package com.java.project.studies;

import java.util.Scanner;

public abstract class subject {
    private Scanner scanner=new Scanner(System.in);
    private String subject_name;
    private degree subject_degree=degree.One;

    public void setSubject_name() {
        this.subject_name = scanner.nextLine();
    }

    public subject() {
        this.subject_name = scanner.nextLine();
    }

    public String getSubject_name() {
        return subject_name;
    }

    public degree getSubject_degree() {
        return subject_degree;
    }

    public void setSubject_degree() {
        Integer deg=new Integer(scanner.nextInt());
        switch(deg) {
            case 1:
                this.subject_degree = degree.One;
                break;
            case 2:
                this.subject_degree = degree.Two;
                break;
            case 3:
                this.subject_degree = degree.Three;
                break;
            case 4:
                this.subject_degree = degree.Four;
                break;
            case 5:
                this.subject_degree = degree.Five;
                break;
            default:
                throw new IllegalArgumentException("Degree out of range 1-5 !");
        }

    }
}
