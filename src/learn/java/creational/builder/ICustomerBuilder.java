package learn.java.creational.builder;


public interface ICustomerBuilder {
    ICustomerBuilder firstName(String firstName);
    ICustomerBuilder lastName(String lastName);
    ICustomerBuilder primaryEmailAddress(String primaryEmailAddress);
    ICustomerBuilder secondaryEmailAddress(String secondaryEmailAddress);
    ICustomerBuilder primaryContactNumber(String primaryContactNumber);
    ICustomerBuilder secondaryContactNumber(String secondaryContactNumber);
}
