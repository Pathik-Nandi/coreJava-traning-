package com.tarento.collectionclass;

import java.util.*;

public class GenericArryList {
    public static void main(String[] args) {
        ArrayList<Object> laptoplist = new ArrayList<>();
        laptoplist.add("DELL");
        laptoplist.add("HP");
        laptoplist.add("Acer");
        laptoplist.add("Apple MackBook");
        laptoplist.add("Lenovo");
        System.out.println("\n Original List of laptop: \n " + laptoplist);


        Add add = new Add(laptoplist);
        Update update = new Update(laptoplist);
        Sort sort = new Sort(laptoplist);
        Binarysearch binarysearch = new Binarysearch(laptoplist);
        Reversesort reversesort = new Reversesort(laptoplist);
        Copylist copylist = new Copylist(laptoplist);
        Disjoint disjoint = new Disjoint(laptoplist);
        Num num = new Num();
        Remove remove = new Remove(laptoplist);
    }
}

class Add {
    Add(List laptoplist) {
        Collections.addAll(laptoplist, "Asus", "Xiaomi Laptops", "HCL", "Sony");
        System.out.println("\n-------------Add Elements----------");
        System.out.println("Laptop List after adding elements collection value:\n" + laptoplist);
        System.out.println("Total No of elements: " + laptoplist.size() + "\n");
    }
}

class Update {
    Update(List laptoplist) {
        try {
            System.out.println("\n-------------Replace Elements----------");
            System.out.println("Before Replace elements \n" + laptoplist);
            laptoplist.set(6, "Samsung Laptops");
            System.out.println("After Update the list \n" + laptoplist);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Sort {
    // Sorting according to default ordering using sort() method
    Sort(List laptoplist) {
        Collections.sort(laptoplist);
        System.out.println("\n-------------Default sort ----------");
        System.out.println("Sorting the Laptop List in ascending order:\n" + laptoplist);
    }
}

class Binarysearch {
    // BinarySearch on the List
    Binarysearch(List laptoplist) {
        System.out.println("\n--------------Binary Search----------------");
        System.out.println("The index of HP is " + Collections.binarySearch(laptoplist, "HP"));
        System.out.println("The index of DELL  is " + Collections.binarySearch(laptoplist, "DELL"));
    }
}

class Reversesort {
    // Sorting according to reverse ordering
    Reversesort(List laptoplist) {
        Collections.sort(laptoplist, Collections.reverseOrder());
        System.out.println("\n--------------reverse order-------------");
        System.out.println("Sorting the laptop List in reverse order:\n" + laptoplist);
    }
}

class Copylist {
    Copylist(List laptoplist) {
        System.out.println("\n-------------copying----------");
        System.out.println("List before copying:\n" + laptoplist);
        List<Object> microprocessor = new ArrayList<>();
        microprocessor.add(" Altera");
        microprocessor.add("AMD");
        microprocessor.add("Intel");
        microprocessor.add("Tesla");
        microprocessor.add("Hitachi");

        // list of microprocessors company
        System.out.println("\n list of microprocessors company: " + microprocessor);

        // Copy the elements from one list to another
        Collections.copy(laptoplist, microprocessor);
        System.out.println("\n Copying microprocessors company to Laptoplist:\n" + laptoplist);

        // sorting the modified list
        Collections.sort(laptoplist);
        System.out.println("\nSorting the Anime List ascending order:\n" + laptoplist);
    }
}

class Disjoint {
    // Check if disjoint or not, if they have no elements in common
    Disjoint(List laptoplist) {
        List<String> newlist = new ArrayList<>();
        newlist.add("Altera");
        newlist.add("AMD");
        newlist.add("Acer");
        System.out.println("\n-------------Disjoint----------");
        System.out.println("laptop List: " + laptoplist);
        System.out.println("New List: " + newlist);
        System.out.println("Checking if the above 2 list are disjoint or not: " + Collections.disjoint(laptoplist, newlist));
    }
}

class Num {
    Num() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(46);
        list.add(38);
        list.add(60);
        list.add(10);
        list.add(8);
        list.add(12);
        System.out.println("\n-------------Sort Max and Min value----------");
        System.out.println(list);
        System.out.println("Value of maximum element from the collection: " + Collections.max(list));
        System.out.println("Value of minimum element from the collection: " + Collections.min(list));
    }
}

class Remove {
    Remove(List laptoplist) {
        System.out.println("\n-------------Delete----------");
        System.out.println(laptoplist);
        System.out.println("\n Delete Particular elements by name/object(DELL)");
        laptoplist.remove("DELL");
        System.out.println(laptoplist);
        System.out.println("\n Delete Particular elements by Index number:3");
        laptoplist.remove(3);
        System.out.println(laptoplist + "\n");
        System.out.println("clears everything from index 3 ");
        laptoplist.subList(3, laptoplist.size()).clear();
        System.out.println(laptoplist);
    }
}
