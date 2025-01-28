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
}

