import java.util.ArrayList;
import java.util.List;

public class ContactManager extends Contact {
    private ArrayList<Contact> contacts;

    public ContactManager(String lastname, String firstName, String email, String phone, List<String> groups,
            String notes) {
        super(lastname, firstName, email, phone, groups, notes);
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
        for(Contact count : contacts){
            if(count.getFirstName().equals(firstname)){
                contacts.remove(count);
                System.out.println("Don !");
                break;
            }
        }
    }
}
