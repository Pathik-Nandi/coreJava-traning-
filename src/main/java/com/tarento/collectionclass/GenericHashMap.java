package com.tarento.collectionclass;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import java.util.HashMap;

public class GenericHashMap {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Pradip");
        map.put(108, "Sanchita");
        map.put(103, "Nandi");
        map.put(102, "Poulomi");
        System.out.println("\n The Original Map: \n" + map);
        HashMapAddElements(map);
        HashMapRemoveElements(map);
        HashMapRplaceingElements(map);
        HashMapSortElements(map);

    }

    public static void HashMapAddElements(HashMap map) {
        map.put(106, "Pragati");//duplicate key
        map.put(107, "Pathik");
        map.put(105, "Riya");
        map.put(102, "Abdul");
        map.put(108, "Raju");
        map.put(104, "Rupa");

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
        map.remove(104);
        map.remove(106);
        System.out.println("After removing  list of elements: \n" + map);
    }

    public static void HashMapRplaceingElements(HashMap map) {
        map.replace(106, "Jesly");
        System.out.println("\n ----------Replacing-------- ");
        System.out.println("After replacing the value of key=106: \n" + map);
    }

    private static void HashMapSortElements(HashMap map) {
//        Iterator <Integer> it = map.keySet().iterator();
//        System.out.println("\n Before Sorting");
//        while(it.hasNext())
//        {
//            int key=(int)it.next();
//            System.out.println("Roll no:  "+key+"     name:   "+map.get(key));
//        }
      System.out.println("\n After Sorting");
//using TreeMap constructor to sort the HashMap
        TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (map);
        Iterator itr=tm.keySet().iterator();
        while(itr.hasNext())
        {
            int key=(int)itr.next();
            System.out.println("Roll no:  "+key+"     name:   "+map.get(key));
        }

    }
}


