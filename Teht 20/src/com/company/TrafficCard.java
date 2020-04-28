package com.company;

public class TrafficCard {
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

    public String getmOwnerName() {
        return mOwnerName;
    }

    public int getmTravellerNumber() {
        return mTravellerNumber;
    }

    @Override
    public String toString(){
        return "owner: "+mOwnerName+" number: "+mTravellerNumber+" balance: "+mBalance;
    }
}
