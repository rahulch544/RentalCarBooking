package org.example.bean;

import lombok.Data;

@Data
public class Bill {
    private final String billId;
    private final Integer paymentAmount;
}
