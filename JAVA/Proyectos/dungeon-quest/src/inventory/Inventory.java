package inventory;

import item.Item;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Inventory {
    public Map<String, List<Item>> items;

    public Inventory() {
        items = new HashMap<>();
    }
    public void addItem(Item item, String category){
        // Si la categoría no existe en el mapa, crea una nueva lista para esa categoría
        items.putIfAbsent(category, new ArrayList<>());
        // Añadir el ítem a la lista de la categoría
        items.get(category).add(item);
    }

    public void removeItem(Item item, String category){
        // Comprueba si la categoría existe en el mapa
        if (items.containsKey(category)) {
            // Elimina el ítem de la lista de la categoría
            items.get(category).remove(item);
            // Si la lista de la categoría está vacía, elimina la categoría del mapa
            if (items.get(category).isEmpty()) {
                items.remove(category);
            }

        }
    }



    public void listItems() {
        for (Map.Entry<String, List<Item>> entry : items.entrySet()) {
            System.out.println("Category: " + entry.getKey());
            for (Item item : entry.getValue()) {
                System.out.println(" - " + item.getName());
            }
        }
    }
}


