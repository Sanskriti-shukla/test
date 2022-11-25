package HashMap_Programs;
//Task---
//Print the name with their branch......
//Output like--
//{CS=[gdfgf, FGDFH], IT=[FGH]}

import java.util.*;

public class Hashmap4 {
    String name;
    String branch;
    int marks;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student you want...!");
        int n = sc.nextInt();
        List<Hashmap4> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the name...!");
            String name = sc.next();
            System.out.println("Enter the branch..!");
            String branch = sc.next();
            System.out.println("Enter the marks..!");
            int marks = sc.nextInt();
            Hashmap4 H = new Hashmap4();
            H.setName(name);
            H.setBranch(branch);
            H.setMarks(marks);
            list.add(H);
        }
        System.out.println(list);
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        for (Hashmap4 hashmap4 : list) {
            if (hashmap4.getBranch().equals("CS")) {
                L1.add(hashmap4.getName());
            } else if (hashmap4.getBranch().equals("IT")) {
                L2.add(hashmap4.getName());

            }
        }
        Collections.sort(L1);
        Collections.sort(L2);
        Collections.reverse(L1);
        Collections.reverse(L2);

        HashMap<String, List<String>> listHashmap4 = new HashMap();
        listHashmap4.put("CS", L1);
        listHashmap4.put("IT", L2);
        System.out.println(listHashmap4);

    }

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
        return "Hashmap4{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", marks=" + marks +
                '}';
    }

}


