package project.chainresponsability;


import project.chainresponsability.generics.OrderReceiver;
import project.chainresponsability.generics.impl.DomesticOrder;
import project.chainresponsability.generics.impl.InternationalOrder;
import project.chainresponsability.generics.impl.LargeOrder;
import project.chainresponsability.generics.impl.MostFavoredCustomerOrderHandler;
import project.chainresponsability.generics.models.Customer;
import project.chainresponsability.generics.models.Order;

import java.util.HashSet;
import java.util.Set;

public class AmazonApp {

    public static final String FAVORITE_CUSTOMER_NAME = "francisco";

    public static void main(String[] args) {

        Customer juan = new Customer("juan");
        Customer francisco = new Customer(FAVORITE_CUSTOMER_NAME);
        Customer william = new Customer("William");
        Set<Customer> favoriteCustomers = new HashSet<>();
        favoriteCustomers.add(william);

        favoriteCustomers.add(francisco);

        OrderReceiver mostFavoredCustomerOrderHandler = new MostFavoredCustomerOrderHandler(favoriteCustomers);


        OrderReceiver large = new LargeOrder();
        mostFavoredCustomerOrderHandler.setNextHandler(large);
        OrderReceiver domestic = new DomesticOrder();
        OrderReceiver international = new InternationalOrder();
        large.setNextHandler(international);
        international.setNextHandler(domestic);


        Order order2 = new Order(2, 30000.0, true, new Customer(FAVORITE_CUSTOMER_NAME));
        Order order0 = new Order(1, 50000.0, false, william);
        Order order1 = new Order(1, 30000.0, false, juan);

        Order order3 = new Order(3, 30000.0, false, new Customer("Roberto"));
        Order order4 = new Order(3, 30000.0, false, new Customer("Eluque Ale Ale"));

        mostFavoredCustomerOrderHandler.handleOrder(order2);
        mostFavoredCustomerOrderHandler.handleOrder(order1);

        mostFavoredCustomerOrderHandler.handleOrder(order3);
        mostFavoredCustomerOrderHandler.handleOrder(order4);


    }
}
