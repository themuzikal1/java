package udemy_exercises.bank;

import java.util.HashMap;

public class Bank {
    public static void main(String[] args ) {
        HashMap<String, String> branches = new HashMap<String, String>();
        branches.put("Capital One", "Korey Brooks");//establishes Capital One branch with Korey Brooks as a customer
        branches.put("Chase", "Mariah Carey"); //adds Mariah Carey to Capital One branch
        branches.put("Chase", "Lady Gaga"); //adds Lady Gaga to Capital One Branch
        branches.put("Chase", "John Smith"); //new Chase branch with John Smith as a customer


        bank.Customer jsmith = new bank.Customer(7648738, 25697, "John Smith", "jsmith@aol.com", "555-555-5555", "Chase"); //establishes John Smiths information
        System.out.println(jsmith.getBalance());
        jsmith.depositFund(22000); // second deposit $22,000
        System.out.println(jsmith.getBalance()); //prints balance after initial deposit + second deposit
        jsmith.withdrawFund(9000); //withdrawing $9000
        System.out.println(jsmith.getBalance()); //prints balance after withdrawal

        //adding additional customers to Capital One branch to clearly demonstrate that I can show just Capital One Customers
        bank.Customer mcarey = new bank.Customer(2334768, 98586, "Mariah Carey", "mcarey@icloud.com", "111-111-1111", "Chase");
        bank.Customer lgaga = new bank.Customer(8747361, 67985, "Lady Gaga", "lgaga@hotmail.com", "777-777-7777", "Chase");

        System.out.println("The Chase customers are " + jsmith.getCustomerName() + " " + jsmith.getAccountNumber() +", " +
                lgaga.getCustomerName() + " " + lgaga.getAccountNumber() +",and " + mcarey.getCustomerName() + " " + mcarey.getAccountNumber()); //prints the Chase customers.

        }
    }


/*
**Banking w/ Java Classes**
   - **Bank class**
      - List of Branches
      - Add a new branch
      - Add a customer to that branch with initial transaction
      - Add a transaction for an existing customer for that branch
      - Show a list of customers for a particular branch and optionally a list of their transactions
   - Demonstration autoboxing and unboxing in your code
   - Think about where you are adding the code to perform certain actions
   - **Branch class**
     - List of Customers
     - List of Transactions
   - **Customer Class**:
     - Customer Name
   - **Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
   - **Bank:**
     
*/