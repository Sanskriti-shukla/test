package com.company.PRACTICE;

import com.sun.source.tree.NewArrayTree;

import java.util.*;

public class Student4 {
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
        return "Student4{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        List<Student4> list= new ArrayList<>();
        for (int i=1; i<=n; i++){
            System.out.println("Enter the name:");
            String name=sc.next();
            System.out.println("Enter the branch:");
            String branch= sc.next();
            System.out.println("Enter the marks:");
            int marks=sc.nextInt();

            Student4 s4= new Student4();
            s4.setName(name);
            s4.setBranch(branch);
            s4.setMarks(marks);
            list.add(s4);
        }

        System.out.println(list);
        int marks1=0;
        int marks2=0;
        int max=0;
        int max1=0;
        List<Integer> L1= new ArrayList<>();
        List<Integer> L2= new ArrayList<>();
        for (Student4 student4 : list) {
            if (student4.getBranch().equals("IT")){
              L1.add(student4.getMarks());
              marks1+=student4.getMarks();

            }
            else  if (student4.getBranch().equals("CE")){
                L2.add(student4.getMarks());
                marks2+=student4.getMarks();

            } }
        System.out.println(marks1);
        System.out.println(marks2);


        HashMap<String,List<Integer>> hashMap = new HashMap<>();
        hashMap.put("IT",L1);
        hashMap.put("CE",L2);
        System.out.println(FindMaxMarks(list));
            
        }


    private static Integer FindMaxMarks(List<Student4> list) {
        System.out.println("Enter the branch for maximum marks");
        Scanner sc= new Scanner(System.in);
        String n=sc.next();
        int max=list.get(0).getMarks();
        for (Student4 student4:list){

            if (max<student4.marks){
                max=student4.getMarks();
            }
        }
        return max;
    }

}
