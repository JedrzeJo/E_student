package com.java.project.studies;

import java.util.Scanner;

public enum degree {
    One(1), Two(2), Three(3), Four(4), Five(5);
    private Integer value;
    degree(Integer value){this.value=value;}

    public Integer getValue() {
        return this.value;
    }
}
