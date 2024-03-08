import java.util.ArrayList;

public class ContactManager { // Modified to reflect the "has-a" relationship between classes
    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Adds a new contact to the list if the contact's phone number is not empty. Displays error messages if the phone number and/or name are empty.
    public void addContact(Contact contact) {
        int phoneVerificationResult = contact.verPhoneAndName();
        if (phoneVerificationResult == -1) 
            System.out.println("The contact's phone number and the Name are empty. Unable to add the contact.");
        else if (phoneVerificationResult == -2)
            System.out.println("The contact's phone number is empty. Unable to add the contact.");
        else if (phoneVerificationResult == -3)
            System.out.println("The contact's Name is empty. Unable to add the contact.");
        else if (phoneVerificationResult == -4)
            System.out.println("The phone number is less than 10 digits.");
        else 
            contacts.add(contact);
    }

    // This method returns the information of the person with the specified phone number.
    public Contact searchForContact(String phone) {
        for(Contact contact : contacts) {
            if(contact.getPhone().equals(phone)) {
                return contact; 
            }
        }
        return null; // No contact found with this phone number
    }
    
    //This methode deletes a contact if the firstname insered is found
    public void deletContactByFirstname(String firstname){
        for(Contact contact : contacts){
            if(contact.getFirstName().equals(firstname)){
                contacts.remove(contact);
                System.out.println("Don !");
                break;
            }
        }
    }

    //DisplayContacts
    public void DisplayContacts(){
        if(contacts != null && contacts.size() != 0){//checking of existance and .. of contact ArrayList 
            for(Contact contact : contacts){
                System.out.println(contact);
            }
        }
        else
            System.out.println("You don't have any contact !");
    }
}
