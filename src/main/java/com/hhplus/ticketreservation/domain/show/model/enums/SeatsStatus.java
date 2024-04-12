package com.hhplus.ticketreservation.domain.show.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SeatsStatus {
    AVAILABLE("이용가능"),
    BOOKED("점유"),
    SOLD_OUT("결제완료");

    private final String description;

}
