package bank;

public class Branch {
    public static void main(String[] args) {
        bank.Customer kbroo = new bank.Customer(9871276, 10000, "Korey Brooks", "korey.brooks@mail.com", "123-456-7890", "Capital One"); //add customer
        System.out.println(kbroo.getBalance()); //prints initial balance
        kbroo.depositFund(6000); // second deposit $6,000
        System.out.println(kbroo.getBalance()); //prints balance after initial deposit + second deposit
        kbroo.withdrawFund(500); //withdrawing $500
        System.out.println(kbroo.getBalance()); //prints balance after withdrawal
    }

    }


/*
**Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
*/

