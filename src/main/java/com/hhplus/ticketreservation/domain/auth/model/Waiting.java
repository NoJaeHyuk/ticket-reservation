package com.hhplus.ticketreservation.domain.auth.model;

import com.hhplus.ticketreservation.common.domain.BaseEntity;
import com.hhplus.ticketreservation.domain.auth.model.enums.WaitingStatus;
import jakarta.persistence.*;

@Entity
public class Waiting extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "waiting_id")
    private Long id;

    private String token;

    @Enumerated(EnumType.STRING)
    private WaitingStatus status;


}
