package com.company.PRACTICE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Student5 {
    String name;
    String branch;
    int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student5{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of student..!");
        int n=sc.nextInt();
        List<Student5> LIST= new ArrayList<>();
        for (int i=1; i<=n; i++){
            System.out.println("Name..!");
            String name= sc.next();
            System.out.println("Branch..!");
            String branch=sc.next();
            System.out.println("Marks..!");
            int marks=sc.nextInt();
            Student5 s5= new Student5();
            s5.setName(name);
            s5.setBranch(branch);
            s5.setMarks(marks);
            LIST.add(s5);
        }
        System.out.println(LIST);
        int count=0;
        int count1=0;
        int max1=0;
        int max2=0;
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the branch name to find max marks");
        String s2= sc1.next();
        for (Student5 student5 : LIST) {
            if (student5.getBranch().equals("IT")){
                count+=1;
                max1=LIST.get(count).getMarks();
                if (max1<student5.marks){
                    max1=student5.getMarks();
                }
                System.out.println(  max1);
//                return max1;
        }
            else if (student5.getBranch().equals("CE")){
                count1+=1;

                max2=LIST.get(count1).getMarks();
                if (max2<student5.marks){
                    max2+=student5.getMarks();
                }
                System.out.println(  max2);
//                return max2
                HashMap<String, Integer> HM= new HashMap<>();
                HM.put("IT",count);
                HM.put("CE",count1);
                HM.put("IT",max1);
                HM.put("CE",max2);
                System.out.println(HM);
    }
}


//    private static int FindMaxMarks(List<Student5> list) {
//        System.out.println("Enter the branch for maximum marks");
//        Scanner sc= new Scanner(System.in);
//        String n=sc.next();
//         max1=list.get(0).getMarks();
//        for (Student5 student5:list){
//
//            if (max<student5.marks){
//                max=student5.getMarks();
//            }
//        }
//        return max;
//    }


    }
    }
