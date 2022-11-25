package Bank;



import java.util.Scanner;

public class BankServiceImpl{
    CustomerDetails customerDetails= new CustomerDetails();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerDetails[] customer = new CustomerDetails[2];
        int i = 0;
        while (true) {
            System.out.println("Enter your choice..");
            System.out.println("1.Add saving account detail\n2.add current account detail\n3.Enter amount in account.\n4.Withdraw amount from account." +
                    "\n5.Display Information of accounts.\n6. Display information of particular account.\n7.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter saving account details.");
                    System.out.println("Enter the account number");
                    double AccountNumber = sc.nextDouble();
                    System.out.println("Enter the name");
                    String name = sc.next();
                    System.out.println("Enter the balance");
                    double balance = sc.nextDouble();
                    customer[i] = new CustomerDetails.SavingAcc(AccountNumber, name, balance);
                    i++;
                }
                break;
                case 2: {
                    System.out.println("Enter current account details..");
                    System.out.println("Enter the account number");
                    double AccountNumber = sc.nextDouble();
                    System.out.println("Enter the name");
                    String name = sc.next();
                    System.out.println("Enter the balance");
                    double balance = sc.nextDouble();
                    customer[i] = new CustomerDetails.CurrentAcc(AccountNumber, name, balance);
                    i++;
                }
                break;
                case 3:
                    System.out.println("add amount in account..");
                    System.out.println("Enter account number.");
                    double k = sc.nextDouble();
                    for (CustomerDetails customer1 : customer) {
                        if (customer1.getAccountNumber() == k) {
                            System.out.println("Enter amount you want to deposit");
                            double k1 = sc.nextDouble();
                            double b = customer1.getBalance() + k1;
                            customer1.setBalance(b);
                        }
                    }
                case 4:
                    System.out.println("withdraw amount from account.");
                    System.out.println("Enter account number.");
                    double k2 = sc.nextDouble();
                    for (CustomerDetails customer1 : customer) {
                        if (customer1.getAccountNumber() == k2) {
                            System.out.println("Enter amount you want to withdraw.");
                            double k3 = sc.nextDouble();
                            if (customer1 instanceof CustomerDetails.CurrentAcc) {
                                if (customer1.getBalance() > 5000 && customer1.getBalance() > (5000 + k3)) {
                                    double b = customer1.getBalance() - k3;
                                    customer1.setBalance(b);
                                } else {
                                    System.out.println("Minimum Balance Is low.Saving Account Minimum balance should be 5000");
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    for (CustomerDetails customer1 : customer) {
                        if (customer1 instanceof CustomerDetails.SavingAcc) {
                            System.out.println("Saving account details.");
                            System.out.println(customer1.toString());
                        } else if (customer1 instanceof CustomerDetails.CurrentAcc) {
                            System.out.println("current account details.");
                            System.out.println(customer1.toString());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Enter account number\n");
                {
                    double k4 = sc.nextDouble();
                    for (CustomerDetails customer1 : customer) {
                        if (customer1.getAccountNumber() == k4) {
                            System.out.println(customer1.toString());
                        }
                    }
                }
                break;
                case 7:
                    System.out.println("you did not selected any option..");
                    return;
            }
        }
    }
}
