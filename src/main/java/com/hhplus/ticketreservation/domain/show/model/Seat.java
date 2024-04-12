package com.hhplus.ticketreservation.domain.show.model;

import com.hhplus.ticketreservation.common.domain.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Seat extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Long id;

    private String seatNumber;
}
