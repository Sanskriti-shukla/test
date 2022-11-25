package Student;

public class Student {
    int ID;
    String firstname;
    double CGPA;

    public Student(int ID, String firstname, double CGPA) {
        this.ID = ID;
        this.firstname = firstname;
        this.CGPA = CGPA;
    }
    public Student() {
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

}
