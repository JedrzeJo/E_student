package com.java.project.E_student;

public enum Degree {
    One(1), Two(2), Three(3), Four(4), Five(5);
    private Integer value;
    Degree(Integer value){this.value=value;}

    public Integer getValue() {
        return this.value;
    }
}
