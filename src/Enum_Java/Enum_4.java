//package Enum_Java;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
////interface Student_profile{
////    void createUser(Role role);
////        }
//
//
//     class Student1 implements Student_profile {
//         Scanner sc = new Scanner(System.in);
//
//         @Override
//         public void createUser(Role role) {
//             Student sp = new Student();
//             System.out.println("Enter the number of student you want...");
//             int n = sc.nextInt();
//             List<Student> list= new ArrayList<>();
//             for (int i = 0; i < n; i++) {
//                 System.out.println("Enter the name");
//                 String name = sc.next();
//                 System.out.println("Enter the age..");
//                 int age = sc.nextInt();
//                 System.out.println("Enter the branch..");
//                 String branch = sc.next();
//                 sp.setName(name);
//                 sp.setAge(age);
//                 sp.setBranch(branch);
//                 list.add(sp);
//             }
//         }}}
//
//enum Role1 {
//    STUDENT,
//    ADMIN,
//    DEPARTMENT;
//}
//public class Enum_4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the case you want....");
//      int str = sc.nextInt();
//        switch (str){
//            case 1:
//
//
//
//            //        Enum_4 e = new Enum_4(Enum_Java.Role1.valueOf(str));
//            //        e.Student_info();
//
//        }
//}}
//
//
