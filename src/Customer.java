import java.util.Scanner;

public class Customer {

    Scanner input = new Scanner(System.in);

    // String array that hold 5 names.
    private String[] customerNames = new String[5];

    // input method for customer data
    public void inputCustomerData() {

        // loop to prompt the administrator for their names.
        for (int i = 0; i < customerNames.length; i++) {
            String firstName;
            String lastName;

            System.out.print("Enter First Name " + (i + 1) + ":");
            firstName = input.nextLine().trim();

            if (firstName.isEmpty()) {

                System.out.println("First name cannot be empty" + "\n");
                System.out.print("Enter First Name " + (i + 1) + ":");
                firstName = input.nextLine().trim();
            }

            System.out.print("Enter Last Name " + (i + 1) + ":");
            lastName = input.nextLine().trim();

            if (lastName.isEmpty()) {
                System.out.println("Last name cannot be empty" + "\n");

                System.out.print("Enter Last Name " + (i + 1) + ":");
                lastName = input.nextLine().trim();
            }
            customerNames[i] = firstName + " " + lastName;
        }


    }
    // This method will display customer names.

    public void displayCustomerData() {
        for (String name : customerNames) {
            System.out.println(name);
        }
    }
}


