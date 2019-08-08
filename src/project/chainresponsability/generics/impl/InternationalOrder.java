package project.chainresponsability.generics.impl;

import project.chainresponsability.generics.OrderReceiver;
import project.chainresponsability.generics.models.Order;

public class InternationalOrder extends OrderReceiver {
    @Override
    public void handleOrder(Order order) {

        if (order.getIsInternational()) {

            System.out.println("InternationalOrderHandler work over  order " + order.getOrderNumber());
        } else {
            this.nextHandler.handleOrder(order);
        }


    }
}
