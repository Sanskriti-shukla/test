package Enum_Java;

import java.util.Scanner;

enum Role {
    STUDENT,
    ADMIN,
    DEPARTMENT;
}

public class Main {
    Role role;
    UserServiceImpl user = new UserServiceImpl();

    public Main(Role role) {
        this.role = role;
    }

    public static void main(String[] args) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the case you want...");
        String str = sc.next();
        Main main = new Main(Role.valueOf(str));
        try {
            main.createDetail();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void createDetail() throws RuntimeException {
        switch (role) {
            case STUDENT:
                user.createUser(role);
                break;
            case DEPARTMENT:
                break;
        }
    }
}