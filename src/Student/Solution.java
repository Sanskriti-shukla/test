package Student;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("number of student.");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the ID.");
            int ID = sc.nextInt();
            System.out.println("Enter the firstname");
            String firstname = sc.next();
            System.out.println("Enter the CGPA");
            double CGPA = sc.nextDouble();
            Student student = new Student(ID, firstname, CGPA);
            students.add(student);
        }
        Collections.sort(students, new Sort());
        System.out.println("After rearranging students by cgpa their names...");
        for (Student student : students) {

            System.out.println(student.getFirstname());
        }
    }
}
class Sort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int compare = o1.getFirstname().compareTo(o2.getFirstname());
        if ((o1.getCGPA() < o2.getCGPA()) && (o1.getCGPA() != o2.getCGPA())) {
            return 1;
        } else if ((o1.getCGPA() == o2.getCGPA()) && (compare < 0)) {
            return -1;
        } else if ((o1.getCGPA() == o2.getCGPA() && (compare > 0))) {
            return 1;
        } else if ((o1.getCGPA() == o2.getCGPA() && compare == 0 && (o1.getID() < o2.getID()))) {
            return 1;
        } else {
            return -1;
        }
    }
}


