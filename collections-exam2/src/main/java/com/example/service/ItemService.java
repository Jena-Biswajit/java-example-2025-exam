package com.example.service;

import com.example.models.Item;

import java.util.*;

public class ItemService {
    public Map<Integer , Item> itemMap = new HashMap<>();

    public void addItem(Item item){
        itemMap.put(item.getId(),item);
    }
    public Item getItemById(int id){
        return itemMap.get(id);
    }
    public Item deleteItem(int id){
       return itemMap.remove(id);
    }

    // return items with quantity greater than 10

    public List<Item> getElementWithQuantityMoreThan10(){
        List<Item> result = new ArrayList<>();
        Iterator<Map.Entry<Integer , Item >>iterator = itemMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer , Item> entry = iterator.next();
            Item item = entry.getValue();
            if (item.quantity >10){
                result.add(item);
            }
        }
        return result;
    }

    //Group items by category
    public Map<String , List<Item>> groupItemsByCategory(){
        Map<String , List<Item>> groupMap = new HashMap<>();
        Iterator<Map.Entry<Integer ,Item>> entryIterator = itemMap.entrySet().iterator();

        while (entryIterator .hasNext()){
            Item item = entryIterator.next().getValue();
            if (!groupMap.containsKey(item.category)){
                groupMap.put(item.category , new ArrayList<Item>());
            }
            groupMap.get(item.category).add(item);
        }
        return groupMap ;
    }

    // delete item with category sports and watch
    public void deleteItemsByCategory(){
        Iterator<Map.Entry<Integer , Item>> mapIterator = itemMap.entrySet().iterator();

        while (mapIterator.hasNext()){
            Map.Entry<Integer ,Item> entry = mapIterator.next();
            String category = entry.getValue().category;
            if (category.equals("sports") || category.equals("watch")){
                mapIterator.remove();
            }
        }
    }

}
