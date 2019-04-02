package com.github.KubaBOR.ParcelService;

public class MainPayout {

    private double managersProfit;


    public static void main(String[] args) {
        MainPayout mp = new MainPayout();
        Courier adam = new Courier("Adam", "Kowalski", "C735",
                new int[]{62, 43, 39, 48, 34, 67, 57, 42, 55, 39, 68, 59, 36, 41, 45, 83, 59, 46, 41, 47},
                new int[]{7, 5, 1, 5, 2, 3, 0, 2, 7, 5, 2, 6, 3, 3, 0, 7, 5, 4, 3, 1});
        Courier greg = new Courier("Grzegorz", "Panewka", "C718",
                new int[]{54, 43, 39, 48, 44, 67, 47, 42, 45, 49, 47, 79, 46, 40, 44, 41, 89, 46, 41, 57},
                new int[]{0, 0, 2, 0, 0, 1, 0, 1, 0, 0, 2, 0, 0, 1, 1, 0, 0, 0, 0, 0});
        Courier martin = new Courier("Marcin", "Marchewka", "C362",
                new int[]{47, 55, 43, 61, 0, 0, 36, 42, 54, 48, 48, 0, 0, 42, 44, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0});

        mp.printPayday(adam);
        mp.printPayday(greg);
        mp.printPayday(martin);

        mp.managersProfitFromCourier(adam);
        mp.managersProfitFromCourier(greg);
        mp.managersProfitFromCourier(martin);

        System.out.println("TOTAL PROFIT FOR MANAGER: " + (int)mp.managersProfit + " PLN");


    }

    public void calculationOfDeliveriesProfit(Courier courier) {
        int[] deliveries = courier.getDeliveriesThisMonth();
        double temp;
        double[] profit = new double[20];

        for (int i = 0; i < courier.getDeliveriesThisMonth().length; i++) {
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
                    courier.setDeliveriesProfit((int)sum);
            }
        }

    }
    public void calculationOfCollectionsProfit(Courier courier) {
        int[] collections = courier.getCollectionsThisMonth();
        double temp;
        double[] profit = new double[20];

        for (int i = 0; i < courier.getCollectionsThisMonth().length; i++) {
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
                    courier.setCollectionsProfit((int)sum);
            }
        }

    }
    public void printPayday(Courier courier) {
        System.out.println("==========================================================");
        System.out.println(courier.toString());

        System.out.println("Total deliveries this month by " + courier.getLastName() + ": " + courier.sumTotalDeliveries());

        calculationOfDeliveriesProfit(courier);
        calculationOfCollectionsProfit(courier);

        System.out.print("Total profit made this month by " + courier.getFirstName() + " " + courier.getLastName() + ": ");
        System.out.print(courier.getDeliveriesProfit() + courier.getCollectionsProfit());
        System.out.print(" PLN \n");

        System.out.println("==========================================================");
    }
    public void managersProfitFromCourier(Courier courier){
        double profit ;

        if (courier.sumTotalDeliveries() > 1000) {
            profit = courier.sumTotalDeliveries() * 3;
            managersProfit = managersProfit + profit;
        }
        else if (courier.sumTotalDeliveries() > 1200) {
            profit = courier.sumTotalDeliveries() * 2.95;
            managersProfit = managersProfit + profit;

        }
        else {
            profit = courier.sumTotalDeliveries() * 3.1;
            managersProfit = managersProfit + profit;

        }


        System.out.println("Managers profit from " + courier.getLastName() + ": " + (int)profit + " PLN");
    }
}
