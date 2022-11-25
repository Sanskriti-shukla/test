package Employee_Task;

import java.util.*;

public class MyClass {
         public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Employee[] employees = new Employee[4];
         for (int i = 0; i < employees.length; i++) {
            System.out.println("EmployeeId");
            int employeeId = sc.nextInt();
            System.out.println("name");
            String name = sc.next();
            System.out.println("branch");
            String branch = sc.next();
            System.out.println("rating");
          double rating=sc.nextDouble();
            System.out.println("Company Transport");
            boolean CompanyTransport = sc.nextBoolean();
            employees[i] = new Employee(employeeId, name, branch, rating, CompanyTransport);
        }
            String branch1 = sc.next();
            int output = findCountOfEmployeesUsingCompTransport(employees, branch1);
            if (output == 0)
            System.out.println("no such employee.");
        else
            System.out.println(output);
             List<Employee> output1=findEmployeeWithSecondHighestRating(employees);
            if (output1==null)
            System.out.println("no employee");
            else
            System.out.println(output1);
    }
            public static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branch) {
            int count = 0;
            for (int i = 0; i < employees.length; i++) {
            if (employees[i].getBranch().equals(branch)) {
              count += 1;
            }
         }
            return count;
    }
    public static List<Employee>  findEmployeeWithSecondHighestRating(Employee[] employees) {
        List<Employee> employees1 = new ArrayList<>();
                for (Employee employee : employees) {
                    for (int i = 0; i < employees.length; i++) {
                        if (!employees[i].isCompanyTransport()) {
                            employees1.add(employees[i]);
                        }}}
                        Collections.sort(employees1, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return (int) (o2.getRating() - o1.getRating());
                    }
                });
                if (employees1.size() > 1) {
                    System.out.println(employees1.get(1));
                } else {
                    System.out.println(employees1.get(employees1.size()-1));
                }
        return employees1;
    }}

