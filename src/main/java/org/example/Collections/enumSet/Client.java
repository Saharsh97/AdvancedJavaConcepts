package org.example.Collections.enumSet;

import java.util.EnumSet;

public class Client {
    public static void main(String[] args) {
        EnumSet<PaymentStatus> enumSet = EnumSet.allOf(PaymentStatus.class);
        EnumSet<PaymentStatus> enumSet2 = EnumSet.of(
                                                PaymentStatus.SUCCESS,
                                                PaymentStatus.FAILURE
                                        );
        for(PaymentStatus paymentStatus : enumSet2) {
            System.out.println(paymentStatus);
        }
    }
}
