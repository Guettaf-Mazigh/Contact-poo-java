import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ContactManager notebook = new ContactManager();
        int n;
        do {
            System.out.println("Menu :");
            System.out.println("1. Add a contact");
            System.out.println("2. Display the contacts");
            System.out.println("3. Search for a contact using the phone number");
            System.out.println("4. Delet a contact using the first name");
            System.out.println("0. Quit");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter the first name:");
                    String firstname = scanner.next();
                    System.out.println("Enter the last name:");
                    String lastname = scanner.next();
                    System.out.println("Enter the Email:");
                    String email = scanner.next();
                    System.out.println("Enter the phone:");
                    String phone = scanner.next();
                    System.out.println("Add a note:");
                    String note = scanner.next();
                    Contact contact = new Contact(lastname,firstname,email,phone, note);
                    notebook.addContact(contact);
                    break;

                case 2 :
                    notebook.DisplayContacts();
                    break;

                case 3 :
                    System.out.println("Enter the phone number :");
                    String pho = scanner.next();
                    Contact test = notebook.searchForContact(pho);
                    if (test != null) {
                        System.err.println(test);
                    }
                    else
                        System.err.println("No contact with this number !");
                    break;

                case 4 :
                    System.out.println("Enter the first name :");
                    String fname = scanner.next();
                    notebook.deletContactByFirstname(fname);
                    break;
                case 0 :
                    System.out.println("Thanks!");
                    return ;
                default:
                    System.out.println("There is no option with this value !");
                    break;
            }
        }while (true);
    } 
}
