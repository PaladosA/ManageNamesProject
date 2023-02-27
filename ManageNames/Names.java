/*
 * Author: Harris Thomas
 * Date: 2/1/2023
 */


package ManageNames;

public class Names {
    // Define Vars
    private String firstName;
    private String lastName = "DefaultV";

    public static int totalFriends = 0;

    // Constructor
    public Names(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        totalFriends++; // post increment operator
    }

    public Names(String firstName) {
        this.firstName = firstName;
        totalFriends++; // post increment operator
    }

    public static void printInformation() {
        System.out.println("This is a template that helps store info about friend");
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}

