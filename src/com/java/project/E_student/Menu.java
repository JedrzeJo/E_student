package com.java.project.E_student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static List<Student> listOFstudents = new ArrayList<>();
    private static List<Teacher> listOFteachers = new ArrayList<>();
    private static List<Subject> listOFsubjects= new ArrayList<>();

    private Scanner scanner=new Scanner(System.in);

    public void student_options(){
        System.out.println("1)Add student \n2)Display student info \n3)Change student status ");
        int menu_option=scanner.nextInt();
        switch(menu_option){
            case 1:
                listOFstudents.add(new Student());
                break;
            case 2:
                System.out.println("Which student You'd like to display?: ");
                int local1=scanner.nextInt()-1;
                listOFstudents.get(local1).display_studnet_info();
                break;
            case 3:
                System.out.println("Change student status(typeStudentNo): ");
                int local2=scanner.nextInt()-1;
                listOFstudents.get(local2).Change_Student_status();
                break;
        }
    }
    public void teacher_options(){
        System.out.println("1)Add teacher \n2)Display teacher info \n3)Change educational degree ");
        int menu_option=scanner.nextInt();
        switch(menu_option) {
            case 1:
                listOFteachers.add(new Teacher());
                break;
            case 2:
                System.out.println("Which TEACHER You'd like to display?: ");
                int local1 = scanner.nextInt() - 1;
                listOFteachers.get(local1).display_teacher_info();
                break;
            case 3:
                System.out.println("Change teacher Edu. degree(typeTeacherNo):");
                int local2 = scanner.nextInt() - 1;
                listOFteachers.get(local2).setEducation_degree();
                break;
        }
    }
    public void subject_options(){
        System.out.println("1)Add subject \n2)Display subject info ");
        int menu_option=scanner.nextInt();
        switch(menu_option){
            case 1:
                listOFsubjects.add(new Subject());
                break;
            case 2:
                System.out.println("Which subject You'd like to display?: ");
                int local1=scanner.nextInt()-1;
                listOFsubjects.get(local1).display_Subject_name();
                break;
        }
    }

    public void display_control_panel(){
        boolean run_menu=true;
        while(run_menu){
            System.out.println("Welcome in MyPg system! Please choose option by typing it's number & Enter.");
            System.out.println("1) Students \n2) Teachers \n3) Subjects \n4) Exit ");
            //Scanner scanner=new Scanner(System.in);
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
