package com.example.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

// concurrent modification exception
public class App3 {
    public static void main(String[] args) {
        List<String> stringList = new CopyOnWriteArrayList<>();
        stringList.add("abc");
        stringList.add("sohan");
        stringList.add("phb");
        stringList.add("nbv");

//        for (String  s : stringList){
//            if (s.equals("sohan")){
//                stringList.remove(s);
//            }
//        }
//        System.out.println(stringList);

        ListIterator<String> stringIterator = stringList.listIterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
            stringList.remove("abc");
            stringList.remove("nbv");
        }

    }
}
