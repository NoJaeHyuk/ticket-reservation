package com.hhplus.ticketreservation.domain.payment.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentStatus {
    WAITING("대기중"),
    SUCCESS("결제성공"),
    CANCEL("결제취소");

    private final String description;
}
