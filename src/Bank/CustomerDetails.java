package Bank;
public class CustomerDetails {
    double AccountNumber;
    String name;
    double balance;

    public double getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CustomerDetails(double accountNumber, String name, double balance) {
        AccountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public CustomerDetails() {

    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "AccountNumber=" + AccountNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +

                '}';
    }
    static class SavingAcc extends CustomerDetails {
        public SavingAcc(double accountNumber, String name, double balance) {
            super(accountNumber, name, balance);
        }
    }

    static class CurrentAcc extends CustomerDetails {

        public CurrentAcc(double accountNumber, String name, double balance) {
            super(accountNumber, name, balance);
        }
    }
}