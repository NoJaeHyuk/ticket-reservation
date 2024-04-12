package com.hhplus.ticketreservation.domain.payment.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentType {
    ACCOUNT("계좌이체"),
    CARD("신용카드"),
    KAKAO("카카오페이");

    private final String description;
}
