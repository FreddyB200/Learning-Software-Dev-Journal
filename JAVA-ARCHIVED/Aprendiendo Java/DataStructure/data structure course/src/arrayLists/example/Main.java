package arrayLists.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();

        userManager.addUser("Freddy");
        userManager.addUser("Mario");
        userManager.addUser("Leydi");
        userManager.addUser("Laura");

        System.out.println("-----------------");
        System.out.println("array list size: "+ userManager.getSize());
        System.out.println("-----------------");

        userManager.displayUsers();

        int searchId = 5;
        User foundUser = userManager.findUserByID(searchId);
        if (foundUser != null) {
            System.out.println("User found: ");
            foundUser.displayInfo();
        } else {
            System.out.println("User with ID " + searchId + " not found.");
        }

    }

}
