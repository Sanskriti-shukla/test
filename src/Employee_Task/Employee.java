package Employee_Task;

public class Employee{
   private int employeeId;
   private String name;
   private String branch;
   private double rating;
    private  boolean CompanyTransport;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isCompanyTransport() {
        return CompanyTransport;
    }

    public void setCompanyTransport(boolean companyTransport) {
        CompanyTransport = companyTransport;
    }



    public Employee() {
    }

    public Employee(int employeeId, String name, String branch, double rating, boolean companyTransport) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        CompanyTransport = companyTransport;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", rating=" + rating +
                ", CompanyTransport=" + CompanyTransport +
                '}';
    }
}
