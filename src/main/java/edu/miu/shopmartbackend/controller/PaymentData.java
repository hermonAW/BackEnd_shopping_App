package edu.miu.shopmartbackend.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentData {

    private long buyer_id;
    private Double amount;
    private String currency;
    private String type;
    @CreditCardNumber
    private String cardNumber;
    private Integer exp_month;
    private Integer exp_year;
    private String cvc;

}
