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

    public void calculationOfDeliveriesProfit() {
        int[] deliveries = this.getDeliveriesThisMonth();
        double temp;
        double[] profit = new double[20];

        for (int i = 0; i < this.getDeliveriesThisMonth().length; i++) {
            switch (deliveries[i]) {
                case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92:
                case 91: case 90: case 89: case 88: case 87: case 86:
                    temp = deliveries[i] - 85;
                    profit[i] = (temp * 2.16);
                    deliveries[i] = deliveries[i] - (int) temp;
                case 85: case 84: case 83: case 82: case 81: case 80: case 79: case 78:
                case 77: case 76: case 75:
                    temp = deliveries[i] - 74;
                    profit[i] = profit[i] + (temp * 2.54);
                    deliveries[i] = deliveries[i] - (int) temp;

                case 74: case 73: case 72: case 71: case 70: case 69: case 68: case 67:
                case 66: case 65:
                    temp = deliveries[i] - 64;
                    profit[i] = profit[i] + (temp * 2.98);
                    deliveries[i] = deliveries[i] - (int) temp;

                case 64: case 63: case 62: case 61: case 60: case 59: case 58: case 57: case 56:
                    temp = deliveries[i] - 55;
                    profit[i] = profit[i] + (temp * 3.50);
                    deliveries[i] = deliveries[i] - (int) temp;

                default:
                    profit[i] = profit[i] + (deliveries[i] * 4.11);
                    double sum = 0;
                    for (int j = 0; j < profit.length; j++) {
                        sum = sum + profit[j];
                    }
                    this.setDeliveriesProfit((int)sum);
            }
        }

    }
    public void calculationOfCollectionsProfit() {
        int[] collections = this.getCollectionsThisMonth();
        double temp;
        double[] profit = new double[20];

        for (int i = 0; i < this.getCollectionsThisMonth().length; i++) {
            switch (collections[i]) {
                case 55: case 54: case 53: case 52: case 51: case 50: case 49: case 48:
                    temp = collections[i] - 47;
                    profit[i] = (temp * 1.13);
                    collections[i] = collections[i] - (int) temp;
                case 47: case 46: case 45: case 44: case 43: case 42:
                    temp = collections[i] - 41;
                    profit[i] = profit[i] + (temp * 1.32);
                    collections[i] = collections[i] - (int) temp;

                case 41: case 40: case 39: case 38: case 37: case 36:
                    temp = collections[i] - 35;
                    profit[i] = profit[i] + (temp * 1.55);
                    collections[i] = collections[i] - (int) temp;

                case 35: case 34: case 33: case 32: case 31:
                    temp = collections[i] - 30;
                    profit[i] = profit[i] + (temp * 1.82);
                    collections[i] = collections[i] - (int) temp;

                case 30: case 29: case 28: case 27:
                    temp = collections[i] - 26;
                    profit[i] = profit[i] + (temp * 2.13);
                    collections[i] = collections[i] - (int) temp;

                case 26: case 25: case 24: case 23:
                    temp = collections[i] - 22;
                    profit[i] = profit[i] + (temp * 2.5);
                    collections[i] = collections[i] - (int) temp;
                case 22: case 21: case 20:
                    temp = collections[i] - 19;
                    profit[i] = profit[i] + (temp * 2.93);
                    collections[i] = collections[i] - (int) temp;
                case 19: case 18:
                    temp = collections[i] - 17;
                    profit[i] = profit[i] + (temp * 3.44);
                    collections[i] = collections[i] - (int) temp;
                case 17: case 16: case 15:
                    temp = collections[i] - 14;
                    profit[i] = profit[i] + (temp * 4.04);
                    collections[i] = collections[i] - (int) temp;

                default:
                    profit[i] = profit[i] + (collections[i] * 5.5);
                    double sum = 0;
                    for (int j = 0; j < profit.length; j++) {
                        sum = sum + profit[j];
                    }
                    this.setCollectionsProfit((int)sum);
            }
        }

    }

    public void printPayday() {
        System.out.println("==========================================================");
        System.out.println(this.toString());

        System.out.println("Total deliveries this month by " + this.getLastName() + ": " + this.sumTotalDeliveries());

        calculationOfDeliveriesProfit();
        calculationOfCollectionsProfit();

        System.out.print("Total profit made this month by " + this.getFirstName() + " " + this.getLastName() + ": ");
        System.out.print(this.getDeliveriesProfit() + this.getCollectionsProfit());
        System.out.print(" PLN \n");

        System.out.println("==========================================================");
    }



    @Override
    public String toString() {
        return "Courier " +
                firstName +
                " " + lastName  +
                ", id = " + id ;
    }
}
