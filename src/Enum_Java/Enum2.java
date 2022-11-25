package Enum_Java;

import java.util.Scanner;

enum  Level {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
        public class Enum2 {
            Level l;

            public Enum2(Level l) {
                this.l = l;
            }
  public void dayIsLike(){
         switch (l){

             case MONDAY:
                 System.out.println("it is monday");
                 break;
             case TUESDAY:
                 System.out.println("it is tuesday");
                 break;
             case WEDNESDAY:
                 System.out.println("it is wednesday");
                 break;
             case THURSDAY:
                 System.out.println("it is thursday");
                 break;
             case FRIDAY:
                 System.out.println("it is friday");
                 break;
             case SUNDAY:
             case SATURDAY:
                 System.out.println("weekends are better.");
                 break;
         }
            }
            public static void main(String[] args) {
                System.out.println("Enter the case you want...");
                Scanner sc= new Scanner(System.in);
                String str= sc.next();
//                String str="MONDAY";
           Enum2 e= new Enum2(Level.valueOf(str));
           e.dayIsLike();
        }

    }

