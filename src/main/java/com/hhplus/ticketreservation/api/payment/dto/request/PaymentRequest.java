package com.hhplus.ticketreservation.api.payment.dto.request;

public class PaymentRequest {

    private Long userId;
    private String type;
    //todo 예약좌석을 어떤 방식으로 처리할 지에 따라 달라질 예정
    private Long reservationId;
    private int price;

}
