
public class Contact {
    private String lastname;
    private String firstName;
    private String email;
    private String phone;
    private String notes;
    private final int ckeckLengthPhne = 10;
    private static int count = 0; // Counter variable to keep track of the number of contacts
    
    public Contact(String lastname, String firstName, String email, String phone, String notes) {
        this.lastname = lastname;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.notes = notes;
        count ++;
    }
    
    //getters and setters
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Checks if the length of the phone number is equal to a predefined length(10)
    private boolean chckLnPhne(){
        if (getPhone().length() != ckeckLengthPhne) //ckeckLengthPhne = 10
            return true;
        else
            return false;
    }

    @Override
    public String toString() {// We will print the information of Contacts.
        return "Contact " + count +"[lastname=" + lastname + ", firstName=" + firstName + ", email=" + email + ", phone=" + phone
                +  ", notes=" + notes + "]";
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int verPhoneAndName(){
        if (getPhone().isEmpty() && getFirstName().isEmpty()) 
            return -1; // Returns -1 if both are empty
        else if (getPhone().isEmpty())
            return -2;  // Returns -2 if phone number is empty
        else if (getFirstName().isEmpty())
            return -3;  // Returns -2 if firstname number is empty
        else if (chckLnPhne())
            return -4; // Returns -4 if phone number length is less than 10 digits
        else
            return 0; // Returns 0 if no issues found
    }
}
