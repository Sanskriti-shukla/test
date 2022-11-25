package com.company.PRACTICE;

import java.util.*;

public class Student {

    private int Grade;
    private String name;


    public Student(){}
    public Student(String name, int grade) {
        this.name = name;
        Grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Grade=" + Grade +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of students");
        int n=sc.nextInt();
        Student[] s=new Student[n];

        List<Student> students = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Name: ");
            String name=sc.next();
//            String name = sc.nextLine();
            System.out.println("Grade: ");
            int grade=sc.nextInt();


            s[i] = new Student(name,grade);

            Student student = new Student();
            student.setName(name);
            student.setGrade(grade);
            students.add(student);
        }


        /*
        students.sort(Comparator.comparing((o1, o2) -> {
            if (o1.getName()!=null && o2.)
        }));*/

//        for(int i = 0; i < s.size(); i++){
//            if(s)
//        }

        System.out.println(Arrays.toString(s));

        //

        System.out.println( getHighestGradeStudent(students));

    }

    private static String getHighestGradeStudent(List<Student> students) {
        int max = students.get(0).getGrade();

        String name = students.get(0).getName();
        for (Student student : students) {
            if (max<student.getGrade()){
                max = student.getGrade();
                name = student.getName();
            }
        }
        return  name;

    }














}