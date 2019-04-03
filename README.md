# ParcelService

This is a calculation code that will calculate payout for couriers and manager of the parcel service company.

## Courier.java

This is a class that allows creation of a courier object with name, id etc. It has two arrays (int) to store 
amount of deliveries for each day, and second array for the collections, so that one value represents each working day in a month.

Once values are entered, the calculation should be performed with `calculationOfDeliveriesProfit()` method and `calculationOfCollectionsProfit()` method. Amount is being calculated based on the deliveries for each day.
This is because there is different rates, in specific compartments. 

e.g. If there was 60 deliveries in a day, first 55 deliveries are calculated at rate 4.11, and then remaining 5 deliveries are calculated at rate of 3.50.

## MainPayout.java

This class allows to create instances of couriers, where you will provide all the information.
In the actual production version there should be a way to input courier ID and values for the deliveries and collections.

To make the program what it is supposed to do, you need to call the `printPayday()` method on each courier.
In the actual production version there could be a loop to avoid redundancy of the code.

Finally, there is calculation of the payout for the manager of those couriers, which is calculated based on how many deliveries 
each courier made in a month.
