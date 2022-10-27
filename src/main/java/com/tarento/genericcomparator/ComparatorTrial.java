package com.tarento.genericcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTrial {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Hp",50000,2);
        Laptop lap2 = new Laptop("DELL",30000,4);
        Laptop lap3 = new Laptop("Acer",80000,8);
        Laptop lap4 = new Laptop("lenovo",62000,16);

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(lap3);
        laptopList.add(lap4);
        laptopList.add(lap2);
        laptopList.add(lap1);
        System.out.println(laptopList);

//        Comparator<Laptop> com= new Comparator<Laptop>()
//        {
//            public int compare(Laptop l1, Laptop l2)
//            {
//                if (l1.getPrice()>l2.getPrice())
//                    return 1;
//                else
//                    return -1;
//            }
//        };
        Collections.sort(laptopList, new GenericComparator("price", Laptop.class));
        System.out.println("\n------------After sorting --------\n");
        for (Laptop l: laptopList)
        {
            System.out.println(l);
        }

    }
}
