package com.company;

public class TrafficCard implements Comparable{
    int mTravellerNumber;
    String mOwnerName;
    float mBalance;

    public TrafficCard(int tNumber, String oName, float balance){
        mTravellerNumber = tNumber;
        mOwnerName = oName;
        mBalance = balance;
    }

    public float getmBalance() {
        return mBalance;
    }

    @Override
    public String toString(){
        return "owner: "+mOwnerName+" number: "+mTravellerNumber+" balance: "+mBalance;
    }

    //sortataan suuremmista pienempään
    @Override
    public int compareTo(Object o) {
        TrafficCard tr = (TrafficCard) o;
        return Float.compare(tr.getmBalance(), mBalance);
    }
}
