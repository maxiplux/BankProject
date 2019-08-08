package project.chainresponsability.generics.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer orderNumber;
    private Double totalAmount;
    private Boolean isInternational;
    private Customer customer;


}
