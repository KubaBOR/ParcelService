package com.github.KubaBOR.ParcelService;


import org.junit.Assert;
import org.junit.Test;

public class MainPayoutTests {

    @Test
    public void calculate_if_payout_for_adam_is_correct(){
        double sumInCategoryTo_55 = 4.11 * (55 + 43 + 39 + 48 + 34 + 55 + 55 + 42
                + 55 + 39 + 55 + 55 + 36 + 41 + 45 + 55 + 55 + 46 + 41 + 47);

        double sumInCategory_56_To_64 = 3.5 * (7 + 9 + 2 + 9 + 4 + 9 + 4);
        double sumInCategory_65_To_74 = 2.98 * (3 + 4 + 9);
        double sumInCategory_75_To_85 = 2.54 * (10);

        double totalOfDeliveries = sumInCategoryTo_55 + sumInCategory_56_To_64
                + sumInCategory_65_To_74 + sumInCategory_75_To_85;

        double sumInCategoryTo14 = 5.5 * (7 + 5 + 1 + 5 + 2 + 3 + 0 + 2 + 7 + 5 + 2 + 6
        + 3 + 3 + 0 + 7 + 5 + 4 + 3 + 1);

        double totalOfCollections = sumInCategoryTo14;

        double totalOfBoth = totalOfDeliveries + totalOfCollections;


        Courier adam = new Courier("Adam", "Kowalski", "C735",
                new int[]{62, 43, 39, 48, 34, 67, 57, 42, 55, 39, 68, 59, 36, 41, 45, 83, 59, 46, 41, 47},
                new int[]{7, 5, 1, 5, 2, 3, 0, 2, 7, 5, 2, 6, 3, 3, 0, 7, 5, 4, 3, 1});
        adam.printPayday();

        Assert.assertEquals((int)totalOfBoth, adam.getDeliveriesProfit() + adam.getCollectionsProfit());
    }
}
