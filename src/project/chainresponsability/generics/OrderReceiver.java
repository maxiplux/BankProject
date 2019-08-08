package project.chainresponsability.generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.chainresponsability.generics.models.Order;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class OrderReceiver {

    protected OrderReceiver nextHandler;

    private Order order;

    abstract public void handleOrder(Order order);
}
