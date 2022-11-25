package Enum_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserServiceImpl implements UserService {
    public static boolean validNumber(String number) throws RuntimeException {
        Pattern p = Pattern.compile("^\\d{10}$");

        Matcher m = p.matcher(number);
        return (m.matches());
    }

    public static boolean validZip(String zip) throws RuntimeException {
        return zip.matches("^[0-9]{5}(?:-[0-9]{4})?$\n");

    }

    public static boolean validAge(String age) throws RuntimeException {
        return age.matches("^(0?[1-9]|[1-9][0-9]|[1][1-9][1-9]|200)$");
    }

    @Override
    public void createUser(Role role) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many users you want...");
        int n = sc.nextInt();
        List<User> list = new ArrayList<>();
        try {
            for (int i = 0; i < n; i++) {
                User user = new User();
                Address address = new Address();
                Contact contact = new Contact();
                System.out.println("firstname...");
                String firstName = sc.next();
                System.out.println("middlename..");
                String middleName = sc.next();
                System.out.println(" lastname...");
                String lastName = sc.next();
                String fullName = firstName + " " + middleName + " " + lastName;
                System.out.println("fullName" + "=" + fullName);
                System.out.println("age......");
                String age = sc.next();
                if (validAge(age)) {
                    user.setAge(age);
                } else {
                    user.setAge(null);
                }
                System.out.println(" address1...!");
                String address1 = sc.next();
                System.out.println("address2....!");
                String address2 = sc.next();
                System.out.println("city Name...!");
                String city = sc.next();
                System.out.println("state....!");
                String state = sc.next();
                System.out.println("Zip code..!");
                String zipCode = sc.next();
                if (validZip(zipCode)) {
                    address.setZipCode(zipCode);
                } else {
                    address.setZipCode(null);
                }
                System.out.println("phone_number");
                String phoneNumber = sc.next();
                if (validNumber(phoneNumber)) {
                    contact.setPhoneNumber(phoneNumber);
                } else {
                    contact.setPhoneNumber(null);
                }
                System.out.println("Email");
                String email = sc.next();
                if (validateEmail(email)) {
                    contact.setEmail(email);
                } else {
                    contact.setEmail(null);
                }
                user.setFirstName(firstName);
                user.setMiddleName(middleName);
                user.setLastName(lastName);
                user.setFullName(fullName);
                address.setAddress1(address1);
                address.setAddress2(address2);
                address.setCity(city);
                address.setState(state);
                user.setContact(contact);
                user.setAddress(address);
                list.add(user);
                System.out.println(list);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public boolean validateEmail(String email) throws RuntimeException {
        return Pattern.matches("[_a-zA-Z1-9]+(\\.[A-Za-z0-9]*)*@[A-Za-z0-9]+\\.[A-Za-z0-9]+(\\.[A-Za-z0-9]*)*", email);
    }
}


