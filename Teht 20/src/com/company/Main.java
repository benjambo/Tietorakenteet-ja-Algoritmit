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

        cardUsers.sort(new NumberComparator());

        for (TrafficCard user : cardUsers) {
            System.out.println(user);
        }

        System.out.println("------");

        cardUsers.sort(new BalanceComparator());
        for (TrafficCard cardUser : cardUsers) {
            System.out.println(cardUser);
        }    }
}
