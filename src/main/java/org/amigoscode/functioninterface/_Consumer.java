package org.amigoscode.functioninterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer customer = new Customer("Yanet", "9867095");
        greetCustomer(customer);
        greetCustomerConsumer.accept(customer);
        greetCustomerConsumerBi.accept(customer,true);
    }

    //Normal java function
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName +", thanks for registering phone number "
                            +customer.customerPhoneNumber);
    }
    //Consumer Functional Interface takes an argument and returns nothing
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+customer.customerName +", thanks for registering phone number "
                    +customer.customerPhoneNumber);

    //BiConsumer Functional Interface takes two arguments and returns nothing
    static BiConsumer<Customer, Boolean> greetCustomerConsumerBi = (customer, showPhoneCustomer) ->
            System.out.println("Hello "+customer.customerName +", thanks for registering phone number "
                    + (showPhoneCustomer ? customer.customerPhoneNumber: "******"));

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
