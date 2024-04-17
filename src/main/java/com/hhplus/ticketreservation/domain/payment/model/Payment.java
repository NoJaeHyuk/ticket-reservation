package com.hhplus.ticketreservation.domain.payment.model;

import com.hhplus.ticketreservation.common.domain.BaseEntity;
import com.hhplus.ticketreservation.domain.payment.model.enums.PaymentStatus;
import com.hhplus.ticketreservation.domain.payment.model.enums.PaymentType;
import com.hhplus.ticketreservation.domain.show.model.Seat;
import com.hhplus.ticketreservation.domain.show.model.ShowRound;
import com.hhplus.ticketreservation.domain.auth.model.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Payment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "show_round_id")
    private ShowRound showRound;

    //todo 개선이 필요한 부분
    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @Enumerated(EnumType.STRING)
    private PaymentType type;

    private int price;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
}
