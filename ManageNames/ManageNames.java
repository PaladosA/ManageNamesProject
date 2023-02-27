/*
 * Author: Harris Thomas
 * Date: 2/1/2023
 */

package ManageNames;

public class ManageNames {
    
    public static void main(String[] args) {
        // To add a new name, copy and paste the templates for both name objects -
        // and System out messages.
        // New name template:
        Names name1 = new Friends("John", "Smith");
        Names name2 = new Friends("Sam", "Adams");

        // Display name template:
        System.out.println("Current Names: ");
        System.out.println("\t" + name1.getFirstName() + " " + name1.getLastName());
        System.out.println("\t" + name2.getFirstName() + " " + name2.getLastName());

        // Call the static method, print Information()
        Friends.printInformation();

        // print out the total number of names created
        System.out.println("Total number of friends: " + Friends.totalFriends);
    }
}
