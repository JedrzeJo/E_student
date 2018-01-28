package com.java.project.E_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Student test1=new Student("Bogdan", "Brzeczyszczykiewicz");
        MyFileWriter Writing_to_file_test=new MyFileWriter();
        Writing_to_file_test.saveToFile(test1);
        Writing_to_file_test.close();

        Scanner scanner=new Scanner(new File("Students.txt"));
        String test2= scanner.nextLine()+scanner.nextLine();
        System.out.println(test2);

        Menu test3=new Menu();           // note 1: shift + f6 na nazwie zmiennej - tricky
        test3.display_control_panel();
    }
}
