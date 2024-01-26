package learn.java.creational.builder;

public class Customer {
    private String firstName;
    private String lastName;
    private String primaryEmailAddress;
    private String secondaryEmailAddress;
    private String primaryContactNumber;
    private String secondaryContactNumber;

    public Customer(CustomerBuilder customerBuilder) {
        this.firstName = customerBuilder.getFirstName();
        this.lastName = customerBuilder.getLastName();
        this.primaryEmailAddress = customerBuilder.getPrimaryEmailAddress();
        this.secondaryEmailAddress = customerBuilder.getSecondaryEmailAddress();
        this.primaryContactNumber = customerBuilder.getPrimaryContactNumber();
        this.secondaryContactNumber = customerBuilder.getSecondaryContactNumber();
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

    public String getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    public void setPrimaryEmailAddress(String primaryEmailAddress) {
        this.primaryEmailAddress = primaryEmailAddress;
    }

    public String getSecondaryEmailAddress() {
        return secondaryEmailAddress;
    }

    public void setSecondaryEmailAddress(String secondaryEmailAddress) {
        this.secondaryEmailAddress = secondaryEmailAddress;
    }

    public String getPrimaryContactNumber() {
        return primaryContactNumber;
    }

    public void setPrimaryContactNumber(String primaryContactNumber) {
        this.primaryContactNumber = primaryContactNumber;
    }

    public String getSecondaryContactNumber() {
        return secondaryContactNumber;
    }

    public void setSecondaryContactNumber(String secondaryContactNumber) {
        this.secondaryContactNumber = secondaryContactNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", primaryEmailAddress='" + primaryEmailAddress + '\'' +
                ", secondaryEmailAddress='" + secondaryEmailAddress + '\'' +
                ", primaryContactNumber='" + primaryContactNumber + '\'' +
                ", secondaryContactNumber='" + secondaryContactNumber + '\'' +
                '}';
    }
}
