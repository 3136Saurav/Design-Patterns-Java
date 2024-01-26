package learn.java.creational.builder;

public class BuilderDriver {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                                .firstName("Kevin")
                                .lastName("Nash")
                                .primaryEmailAddress("kevin@nash.com")
                                .primaryContactNumber("9876543210")
                                .build();


        System.out.println(customer);
    }
}
