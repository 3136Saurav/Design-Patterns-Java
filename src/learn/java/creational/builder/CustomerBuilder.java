package learn.java.creational.builder;

/*
Builder design pattern eliminates the telescopic constructor problem where we create several overloaded constructors with fewer arguments.

1.The Builder interface declares product construction steps that are common to all types of builders.
2. Concrete Builders provide different implementations of the construction steps. Concrete builders may produce products that don’t follow the common interface.
3. Products are resulting objects. Products constructed by different builders don’t have to belong to the same class hierarchy or interface.
4. The Director class defines the order in which to call construction steps, so you can create and reuse specific configurations of products.


Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).


**/


public class CustomerBuilder implements ICustomerBuilder {
    private String firstName;
    private String lastName;
    private String primaryEmailAddress;
    private String secondaryEmailAddress;
    private String primaryContactNumber;
    private String secondaryContactNumber;

    @Override
    public CustomerBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public CustomerBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public CustomerBuilder primaryEmailAddress(String primaryEmailAddress) {
        this.primaryEmailAddress = primaryEmailAddress;
        return this;
    }

    @Override
    public CustomerBuilder secondaryEmailAddress(String secondaryEmailAddress) {
        this.secondaryEmailAddress = secondaryEmailAddress;
        return this;
    }

    @Override
    public CustomerBuilder primaryContactNumber(String primaryContactNumber) {
        this.primaryContactNumber = primaryContactNumber;
        return this;
    }

    @Override
    public CustomerBuilder secondaryContactNumber(String secondaryContactNumber) {
        this.secondaryContactNumber = secondaryContactNumber;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    public String getSecondaryEmailAddress() {
        return secondaryEmailAddress;
    }

    public String getPrimaryContactNumber() {
        return primaryContactNumber;
    }

    public String getSecondaryContactNumber() {
        return secondaryContactNumber;
    }

    public Customer build() {
        return new Customer(this);
    }
}
