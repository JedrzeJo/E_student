package com.java.project.studies;

import java.util.Scanner;

public class menu {

    public void student_options(){

    }
    public void teacher_options(){

    }
    public void subject_options(){

    }

    public void display_control_panel(){
        boolean run_menu=true;
        while(run_menu){
        System.out.println("Welcome in MyPg system! Please choose option by typing it's number & Enter.");
        System.out.println("1) Students \n2) Teachers \n3) Subjects \n4) Exit ");
        Scanner scanner=new Scanner(System.in);
        int menu_option=scanner.nextInt();
        switch(menu_option){
            case 1:
                student_options();
                break;
            case 2:
                teacher_options();
                break;
            case 3:
                subject_options();
                break;
            case 4:
                run_menu=false;
                break;
        }

        }
    }
}
