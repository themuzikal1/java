package udemy_exercises.cell_phone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static udemy_exercises.cell_phone.CellPhone cellphone = new udemy_exercises.cell_phone.CellPhone("123-456-7890");

    public static void main(String[] args){

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;

                case 1:
                    cellphone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    searchContact();
                    break;

                case 6:
                    printActions();
                    break;


            }

        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        udemy_exercises.cell_phone.Contact newContact = udemy_exercises.cell_phone.Contact.createContact(name, phone);
        if(cellphone.addNewContact(newContact)) {
            System.out.println("New contact added! name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file...");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        udemy_exercises.cell_phone.Contact existingContactRecord = cellphone.searchContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        udemy_exercises.cell_phone.Contact newContact = udemy_exercises.cell_phone.Contact.createContact(newName, newNumber);
        if(cellphone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated contact!");
        } else {
            System.out.println("Error updating contact!");
        }
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        udemy_exercises.cell_phone.Contact existingContactRecord = cellphone.searchContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }

        if (cellphone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted!");
        } else {
            System.out.println("Error deleting contact!");
        }
    }
        private static void searchContact() {
            System.out.println("Enter existing contact name: ");
            String name = scanner.nextLine();
            udemy_exercises.cell_phone.Contact existingContactRecord = cellphone.searchContact(name);
            if (existingContactRecord == null) {
                System.out.println("Contact not found!");
                return;
            }
            System.out.println("Name: " + existingContactRecord.getName() + " phone number is: " + existingContactRecord.getPhoneNumber());

    }
    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - to search if a contact exists\n" +
                           "6 - to print a list of available actions");
        System.out.println("Please make a selection: ");
    }









}
