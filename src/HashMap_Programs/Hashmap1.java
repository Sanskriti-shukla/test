package HashMap_Programs;
//Task :
//  create one hash map for Student in which each students will group by the Division ,
//     there are two divisions A and B
//Take inputs from user that how many students users wants to add and then take Division and student name
// now create map which has Division as key and total students count of that division :
// for ex: final out will be -> A division has 100 students and B division has 50 students.
// Note : if user add another division then send error.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Hashmap1 {
    String name;
    String division;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student...!");
        int n = sc.nextInt();
        List<Hashmap1> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter name..!");
            String name = sc.next();
            System.out.println("Enter division.!");
            String division = sc.next();
            Hashmap1 hashmap1 = new Hashmap1();
            hashmap1.setName(name);
            hashmap1.setDivision(division);
            list.add(hashmap1);
        }
        System.out.println(list);
        int count = 0;
        int count1 = 0;
        for (Hashmap1 hashmap1 : list) {
            if (hashmap1.getDivision().equals("A")) {
                count += 1;
            } else if (hashmap1.getDivision().equals("B")) {
                count1 += 1;
            }
        }
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A", count);
        hm.put("B", count1);
        System.out.println(hm);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Hashmap1{" +
                "name='" + name + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
