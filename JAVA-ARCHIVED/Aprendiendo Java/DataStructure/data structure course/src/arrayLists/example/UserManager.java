package arrayLists.example;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(String name){
        User user = new User(name);
        users.add(user);
//        users.add(new User(name));
        System.out.println("User added: " + name + " (ID: " + user.getId() + ")");
    }

    public List<User> getUsers(){
        return new ArrayList<>(users);
    }

    public void displayUsers(){
        if (users.isEmpty()){
            System.out.println("No users registered");
            return;
        }
        System.out.println("Users list!");
        for (User user : users){
            user.displayInfo();
            System.out.println("-------------------");
        }
    }

    public User findUserByID(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public int getSize(){
        return users.size();
    }


}

