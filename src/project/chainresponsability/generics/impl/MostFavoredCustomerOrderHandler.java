package project.chainresponsability.generics.impl;

import project.chainresponsability.generics.OrderReceiver;
import project.chainresponsability.generics.models.Customer;
import project.chainresponsability.generics.models.Order;

import java.util.HashSet;
import java.util.Set;


public class MostFavoredCustomerOrderHandler extends OrderReceiver {

    private Set<Customer> customers = new HashSet<Customer>();

    public MostFavoredCustomerOrderHandler(Set<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void handleOrder(Order order) {
        if (this.customers.stream().anyMatch(customer -> order.getCustomer().getName().equals(customer.getName()))) {
            System.out.printf("We love you %s  and  this order was manage by  MostFavoredCustomerOrderHandler ", order.getCustomer().getName(), order.getOrderNumber());

        } else {
            this.nextHandler.handleOrder(order);
        }


    }
}
