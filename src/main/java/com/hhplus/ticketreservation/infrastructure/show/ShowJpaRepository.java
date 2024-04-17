package com.hhplus.ticketreservation.infrastructure.show;

import com.hhplus.ticketreservation.domain.show.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ShowJpaRepository extends JpaRepository<Show, Long> {

    List<Show> findByEndDateAfter(LocalDate currentDate);
}
