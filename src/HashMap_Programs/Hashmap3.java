package HashMap_Programs;

import java.util.*;

public class Hashmap3 {
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
        return "Hashmap3{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        List<Hashmap3> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the name:");
            String name = sc.next();
            System.out.println("Enter the branch:");
            String branch = sc.next();
            System.out.println("Enter the marks:");
            int marks = sc.nextInt();

            Hashmap3 s4 = new Hashmap3();
            s4.setName(name);
            s4.setBranch(branch);
            s4.setMarks(marks);
            list.add(s4);
        }

        System.out.println(list);
        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();

        for (Hashmap3 hashmap3 : list) {
            if (hashmap3.getBranch().equals("IT")) {
                L1.add(hashmap3.getMarks());

            } else if (hashmap3.getBranch().equals("CS")) {
                L2.add(hashmap3.getMarks());

            }
        }
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        hashMap.put("IT", L1);
        hashMap.put("CS", L2);
        System.out.println(hashMap);
        System.out.println("Enter the branch you want max marks..!");
        String Branch = sc.next();
        for (Map.Entry<String, List<Integer>> stringListEntry : hashMap.entrySet()) {
            if (stringListEntry.getKey().equals(Branch)) {
                System.out.println(Branch);
                List<Integer> list1 = stringListEntry.getValue();
                System.out.println(Collections.max(list1));
            }
        }
    }
}
