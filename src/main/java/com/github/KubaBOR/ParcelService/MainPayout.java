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

        adam.printPayday();
        greg.printPayday();
        martin.printPayday();

        mp.managersProfitFromCourier(adam);
        mp.managersProfitFromCourier(greg);
        mp.managersProfitFromCourier(martin);

        System.out.println("TOTAL PROFIT FOR MANAGER: " + (int)mp.managersProfit + " PLN");


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
