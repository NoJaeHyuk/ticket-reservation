package com.hhplus.ticketreservation.domain.show.model;

import com.hhplus.ticketreservation.common.domain.BaseEntity;
import com.hhplus.ticketreservation.domain.show.model.enums.SeatsStatus;
import jakarta.persistence.*;

@Entity
public class SeatStatus extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_status_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private SeatsStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_status_id")
    private Seat seat;
}
