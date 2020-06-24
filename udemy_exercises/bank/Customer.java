package bank;

<<<<<<< HEAD

public class Customer {
    private double accountNumber = 0;
    private double balance = 0;
    private String customerName = "";
    private String email = "";
    private String phoneNumber;
    private String branch;

    public Customer(double accNo, double balance, String cName, String email, String pNo, String bran) {
        this.accountNumber = accNo;
        this.balance = balance;
        this.customerName = cName;
        this.email = email;
        this.phoneNumber = pNo;
        this.branch = bran;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public String getBranch() {
        return branch;
    }

    public double depositFund(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return balance;
        }
        System.out.println("Please enter a valid amount!");
        return -1;
    }

    public double withdrawFund(double amount) {
        if (amount > 0 && (this.balance - amount) > 0) {
            this.balance -= amount;
            return balance;
        }
        System.out.println("Please enter a valid amount");
        return -1;
    }
    public String getCapitalOneCustomers() {
        if (branch == "Capital One") {
            return customerName + accountNumber;
        }
        System.out.println("");
        return "";
    }
}


=======
public class Customer {

}

>>>>>>> 4442a3eb30263285baac120a31fb5e8061730a94
/*
- **Customer Class**:
- Customer Name
*/

