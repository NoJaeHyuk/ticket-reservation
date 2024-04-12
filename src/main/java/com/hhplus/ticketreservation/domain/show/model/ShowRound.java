package com.hhplus.ticketreservation.domain.show.model;

import com.hhplus.ticketreservation.common.domain.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class ShowRound extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_round_id")
    private Long id;

    private LocalDate showDate;

    private LocalTime showTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "show_id")
    private Show show;

}
