import java.util.Random;

abstract class Customer {
    private String firstName;
    private String lastName;
    private String customerID;
    private String customerLevel;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        setCustomerID();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setCustomerID() {
        String lastNamePrefix = lastName.length() >= 4 ? lastName.substring(0, 4) : lastName + "X".repeat(4 - lastName.length());
        Random rand = new Random();
        String randomNums = "";
        for (int i = 0; i < 5; i++) {
            randomNums += Integer.toString(rand.nextInt(10));
        }
        customerID = lastNamePrefix.toUpperCase() + "-" + randomNums;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public abstract double incentives();

    @Override
    public String toString() {
        return String.format("ID: %s%nName: %s %s%n", customerID, firstName, lastName);
    }
}
