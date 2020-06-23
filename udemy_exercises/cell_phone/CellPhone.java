package udemy_exercises.cell_phone;

import java.util.ArrayList;

class CellPhone {
    private String myNumber;
    private ArrayList<udemy_exercises.cell_phone.Contact> myContacts;

    public CellPhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<udemy_exercises.cell_phone.Contact>();
    }
    public boolean addNewContact(udemy_exercises.cell_phone.Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(udemy_exercises.cell_phone.Contact oldContact, udemy_exercises.cell_phone.Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0 ) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(udemy_exercises.cell_phone.Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(udemy_exercises.cell_phone.Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i=0; i<this.myContacts.size(); i++) {
            udemy_exercises.cell_phone.Contact contact = this.myContacts.get(i);
                if(contact.getName().equals(contactName)) {
                    return i;
                }
            }
        return -1;
    }
  public String searchContact(udemy_exercises.cell_phone.Contact contact) {
        if(findContact(contact) >0) {
            return contact.getName();
        }
        return null;
  }
  public udemy_exercises.cell_phone.Contact searchContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }
        return null;
  }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " ->" +
                                             this.myContacts.get(1).getPhoneNumber());
        }
    }
















}



/*
**Cell Phone with Java Classes**
    - **CellPhone Class:**
        - Contact List
        - quit()
        - showContacts()
        - addContact()
        - updateContat()
        - removeContact()
        - searchContact()
      * **When adding or updating be sure to check if the contact already exists**
      * **Be sure not to expose the inner workings of the Arraylist to MobilePhone (use concepts of encapsulation to meet this requirement)**
*/
