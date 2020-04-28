package com.company;

import java.util.Comparator;

public class NumberComparator implements Comparator {
    public int compare(Object o1,Object o2){
        TrafficCard a1 = (TrafficCard) o1;
        TrafficCard a2 = (TrafficCard) o2;
        return Integer.compare(a1.getmTravellerNumber(), a2.getmTravellerNumber());
    }
}