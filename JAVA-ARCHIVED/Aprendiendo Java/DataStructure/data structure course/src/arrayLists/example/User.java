package arrayLists.example;

import java.util.UUID;

public class User {
    private static int counter = 1; //contador de los ID secuenciales

    private final String uuid; //id unico uuid
    private final int id; //id secuencias counter
    private String name;

    public User(String name){
        this.uuid = UUID.randomUUID().toString(); //se genenra un ID unico
        this.id = counter++;
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("UUID: " + uuid);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

}
