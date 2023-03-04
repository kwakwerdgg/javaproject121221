public class RetailCustomer extends Customer {
    private double totalPurchases;

    public RetailCustomer(String firstName, String lastName, double totalPurchases) {
        super(firstName, lastName);
        this.totalPurchases = totalPurchases;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(double purchases) {
        this.totalPurchases = purchases;
    }

    public double findDiscountRate() {
        if (totalPurchases > 10000) {
            return 0.15;
        } else if (totalPurchases > 5000) {
            return 0.10;
        } else if (totalPurchases > 1000) {
            return 0.5;
        } else {
            return 0;
        }
    }


    public double incentives() {
        double incentives = findDiscountRate() * totalPurchases;
        return incentives;
    }




    public String toString() {

        double netPurchases =this.totalPurchases - this.incentives();


        return super.toString() +"\nRetail Customer"+"\nTotal purchases: "+this.totalPurchases+ "\nDiscount Rate: "+findDiscountRate()*100+"%"+"\nDiscount Incentive"+this.incentives()+"\nNet Purchases:" +netPurchases;
    }
}
