package com.github.KubaBOR.ParcelService;

public class Courier {

    private String firstName;
    private String lastName;
    private String id;
    private int[] deliveriesThisMonth;
    private int[] collectionsThisMonth;
    private int deliveriesProfit;
    private int collectionsProfit;

    public Courier(){}

    public Courier(String firstName, String lastName, String id, int[] deliveriesThisMonth, int[] collectionsThisMonth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.deliveriesThisMonth = deliveriesThisMonth;
        this.collectionsThisMonth = collectionsThisMonth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getDeliveriesThisMonth() {
        return deliveriesThisMonth;
    }

    public void setDeliveriesThisMonth(int[] deliveriesThisMonth) {
        this.deliveriesThisMonth = deliveriesThisMonth;
    }


    public int[] getCollectionsThisMonth() {
        return collectionsThisMonth;
    }

    public void setCollectionsThisMonth(int[] collectionsThisMonth) {
        this.collectionsThisMonth = collectionsThisMonth;
    }

    public int getDeliveriesProfit() {
        return deliveriesProfit;
    }

    public void setDeliveriesProfit(int deliveriesProfit) {
        this.deliveriesProfit = deliveriesProfit;
    }

    public int getCollectionsProfit() {
        return collectionsProfit;
    }

    public void setCollectionsProfit(int collectionsProfit) {
        this.collectionsProfit = collectionsProfit;
    }

    public int sumTotalDeliveries(){
        int sum = 0;
        for (int i = 0; i < Courier.this.getDeliveriesThisMonth().length; i++) {
            sum = sum + Courier.this.getDeliveriesThisMonth()[i];
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Courier " +
                firstName +
                " " + lastName  +
                ", id = " + id ;
    }
}
