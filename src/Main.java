public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Customer tester!");
        System.out.println("---------------------------------------------------------");
        System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods");
        System.out.println("---------------------------------------------------------");
        // Step 1: Create an array of type Customer named customerArray and size it to hold 3 customers.
        Customer[] customerArray = new Customer[3];

        // Step 2: Create three Customer objects as specified in the prompt.
        BusinessCustomer mikeHolmes = new BusinessCustomer("Mike", "Holmes", "Home Depot", 10, 3105.50);
        RetailCustomer devGelda = new RetailCustomer("Dev", "Gelda", 11200.00);
        PreferredCustomer weiPing = new PreferredCustomer("Wei", "Ping", 6466.85, 5);

        // Step 3: Assign each customer object to an element of the customerArray.
        customerArray[0] = mikeHolmes;
        customerArray[1] = devGelda;
        customerArray[2] = weiPing;

        // Step 4: Loop through the customerArray and print each object calling the toString() method.
        for (int i = 0; i < customerArray.length; i++) {
            System.out.println("\n"+customerArray[i].toString());
        }

        System.out.println();

        // Step 5: Loop through the customerArray and print each customer's full name and incentives.
        for (int i = 0; i < customerArray.length; i++) {
            System.out.println(customerArray[i].getFirstName() + " "+ customerArray[i].getLastName()+ " is entitled to an incentive of $" + customerArray[i].incentives());
        }
        System.out.println();

        // Step 6: Create three more Customer objects using their respective subclass types.
        BusinessCustomer tristanLee = new BusinessCustomer("Tristan", "Lee", "Starbucks", 15, 9875.25);
        RetailCustomer carlosBeltran = new RetailCustomer("Carlos", "Beltran", 3100.50);
        PreferredCustomer artiPatel = new PreferredCustomer("Arti", "Patel", 10450.00,  10);

        // Step 7: Print each new Customer object calling the toString() method.
        System.out.println(tristanLee.toString()+"\n");
        System.out.println(carlosBeltran.toString()+"\n");
        System.out.println(artiPatel.toString()+"\n");

        // Step 8: Use the setter methods to make changes to the newly created customer objects.
        tristanLee.setTotalPurchases(8895.00);
        tristanLee.setDiscountRate(12);

        carlosBeltran.setTotalPurchases(100500.00);

        artiPatel.setTotalPurchases(14987.24);
        artiPatel.setLastName("Patel-Ruhil");
        artiPatel.setCashbackRate(13);

        // Step 9: Print each new Customer object again to show the above changes.
        System.out.println(tristanLee.toString()+"\n");
        System.out.println(carlosBeltran.toString()+"\n");
        System.out.println(artiPatel.toString()+"\n");
    }
}