package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<TrafficCard> cardUsers = new ArrayList<TrafficCard>();
        RandomString rString = new RandomString(10);
        float genBalance;
        TrafficCard myCard;
        Random r = new Random();
        int i;
        for (i = 0; i < 10; i++) {
            genBalance = ((float) r.nextInt(1000) / 10);
            myCard = new TrafficCard(r.nextInt(100), rString.nextString(), genBalance);
            cardUsers.add(myCard);
        }

        cardUsers.stream().sorted((h1,h2) -> {
            return h1.getmTravellerNumber() - h2.getmTravellerNumber();
        }).forEach(System.out::println);    }
}
