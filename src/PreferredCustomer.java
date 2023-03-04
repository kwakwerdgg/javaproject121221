public class PreferredCustomer extends RetailCustomer {
    private int cashbackRate;

    public PreferredCustomer(String firstName, String lastName,  double totalPurchases, int cashbackRate) {
        super(firstName, lastName, totalPurchases);
        this.cashbackRate = cashbackRate;
    }

    public int getCashbackRate() {
        return cashbackRate;
    }

    public void setCashbackRate(int cashbackRate) {
        this.cashbackRate = cashbackRate;
    }

    @Override
    public double incentives() {
        double discountIncentive = super.incentives();
        double cashbackIncentive = (getCashbackRate() / 100.0) * getTotalPurchases();
        return discountIncentive + cashbackIncentive;
    }


    public String toString() {
        double netPurchases = this.getTotalPurchases() - this.incentives();


        return super.toString() +"\nPreferred Customer"+"\nTotal purchases: "+ this.getTotalPurchases() + "\nDiscount Rate: "+findDiscountRate()*100+"%"+"\nDiscount Incentive"+this.incentives()+"\nNet Purchases:" +netPurchases;
    }
}
