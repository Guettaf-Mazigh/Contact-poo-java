import java.util.List;

public class Contact {
    private String lastname;
    private String firstName;
    private String email;
    private String phone;
    private List<String> groups;
    private String notes;
    
    public Contact(String lastname, String firstName, String email, String phone, List<String> groups, String notes) {
        this.lastname = lastname;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.groups = groups;
        this.notes = notes;
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
    if(phone.length() == 10) //Verification of the length of the phone number to ensure it has 10 digits
            this.phone = phone;
        else
            System.out.println("The phone number should have 10 digits.");
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int verPhoneAndName(){
        if (getPhone().isEmpty() && getFirstName().isEmpty()) 
            return -1;
        else if (getPhone().isEmpty())
            return -2;
        else if (getFirstName().isEmpty())
            return -3;
        else
            return 0;
    }
}
