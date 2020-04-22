package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(14);
        list.add(20);
        list.add(34);

        System.out.println(list);

        // Max number to be found.
        int key = Collections.max(list);
        int res = Collections.binarySearch(list, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        // Min number to be found
        key = Collections.min(list);
        res = Collections.binarySearch(list, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        // Number 20 to be found
        key = 20;
        res = Collections.binarySearch(list, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        // Number that doesnt exist
        key = 9;
        res = Collections.binarySearch(list, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        System.out.println();
        list.add(75);
        System.out.println(list);

        // Max number to be found.
        int key2 = Collections.max(list);
        int res2 = Collections.binarySearch(list, key);
        if (res >= 0)
            System.out.println(key2 + " found at index = "
                    + res2);
        else
            System.out.println(key2 + " Not found");

        // Max number to be found.
        int key3 = Collections.min(list);
        int res3 = Collections.binarySearch(list, key);
        if (res3 >= 0)
            System.out.println(key3 + " found at index = "
                    + res3);
        else
            System.out.println(key3 + " Not found");
// Number 20 to be found
        key = 20;
        res = Collections.binarySearch(list, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        // Number that doesnt exist
        key = 9;
        res = Collections.binarySearch(list, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");
    }
}