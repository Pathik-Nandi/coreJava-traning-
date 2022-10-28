package com.tarento.collectionclass;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import java.util.HashMap;

public class GenericHashMap {
    public static void main(String[] args) throws Exception {
        java.util.HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Pradip");
        map.put(102, "Abdul");
        map.put(103, "Sanchita");
        map.put(105, "Riya");
        map.put(106, "Poulomi");
        System.out.println("\n The Original Map: \n" + map);
        HashMapAddElements(map);
        HashMapRemoveElements(map);
        HashMapRplaceingElements(map);
        HashMapSortElements(map);

    }

    public static void HashMapAddElements(HashMap map) {
        map.put(106, "Pragati");//duplicate key
        map.put(107, "Pathik");
        map.put(108, "Raju");
        System.out.println("\n ----------Adding-------- ");
        System.out.println("After Adding Elements ");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
    }

    public static void HashMapRemoveElements(HashMap map) {
        System.out.println("\n ----------Removing-------- ");
        System.out.println("Before removing list of elements: \n" + map);
        map.remove(105);
        map.remove(107);
        System.out.println("After removing  list of elements: \n" + map);
    }

    public static void HashMapRplaceingElements(HashMap map) {
        map.replace(106, "Jesly");
        System.out.println("\n ----------Replacing-------- ");
        System.out.println("After replacing the value of key=106: \n" + map);
    }

    private static void HashMapSortElements(HashMap map) {

    }
}


