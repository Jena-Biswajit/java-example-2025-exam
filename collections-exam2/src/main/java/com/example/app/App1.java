package com.example.app;

//import com.example.models.Service;
import com.example.models.Item;
import com.example.service.ItemService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Item item ;
        ItemService service = new ItemService();
//        Item item = new Item();
        service.addItem(new Item(1, "Football", 15, "sports"));
        service.addItem(new Item(2, "T-Shirt", 5, "clothing"));
        service.addItem(new Item(3, "Watch1", 8, "watch"));
        service.addItem(new Item(4, "Book", 20, "education"));

//        System.out.println(item);
        // return
        int serchId = 1;
        Item foundItem = service.getItemById(serchId);

        System.out.println(foundItem);


        item = service.deleteItem(serchId);
        System.out.println("\nDeleting item with serchId:" +item);

        System.out.println("\nItems with quantity greater than 10:");
        for (Item item1 : service.getElementWithQuantityMoreThan10()) {
            System.out.println(item1);
        }

        System.out.println("\nGroup by Category:");
        Map<String, List<Item>> grouped = service.groupItemsByCategory();
        for (String category : grouped.keySet()) {
            System.out.println(category + ": " + grouped.get(category));
        }


        service.deleteItemsByCategory();

    }
}
