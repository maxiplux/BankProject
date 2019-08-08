package project.chainresponsability.generics.impl;

import project.chainresponsability.generics.OrderReceiver;
import project.chainresponsability.generics.models.Order;

public class LargeOrder extends OrderReceiver {


    @Override
    public void handleOrder(Order order) {
        if (order.getTotalAmount() > 30_000.0) {
            System.out.println("LargeOrderHandler handles order " + order.getOrderNumber());
        } else
            this.nextHandler.handleOrder(order);


    }
}
