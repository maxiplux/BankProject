package project.chainresponsability.generics.impl;

import project.chainresponsability.generics.OrderReceiver;
import project.chainresponsability.generics.models.Order;


public class DomesticOrder extends OrderReceiver {
    @Override
    public void handleOrder(Order order) {
        System.out.println("DomesticOrderHandler worked over " + order.getOrderNumber());

    }
}
