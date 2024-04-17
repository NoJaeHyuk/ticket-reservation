package com.hhplus.ticketreservation.domain.show.model;

import com.hhplus.ticketreservation.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "shows")
public class Show extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id")
    private Long id;

    private String title;

    @Lob
    private String content;

    private String performer;

    private String place;

    private LocalDate startDate;

    private LocalDate endDate;

    @Builder
    private Show(Long id, String title, String content, String performer, String place, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.performer = performer;
        this.place = place;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
