class BusinessCustomer extends Customer {
    private String companyName;
    private int discountRate;
    private double totalPurchases;

    public BusinessCustomer(String firstName, String lastName,  String companyName, int discountRate, double totalPurchases) {
        super(firstName, lastName);
        this.companyName = companyName;
        this.discountRate = discountRate;
        this.totalPurchases = totalPurchases;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    @Override
    public double incentives() {
        return totalPurchases * ((double) discountRate/100);
    }


    public String toString() {
        double netPurchases =this.totalPurchases - this.incentives();


        return super.toString() + "Buisness Customer For "+ this.getCompanyName()+"\nTotal purchases: "+this.totalPurchases+ "\nDiscount Rate: "+discountRate+"%"+"\nDiscount Incentive"+this.incentives()+"\nNet Purchases:" +netPurchases;
    }
}