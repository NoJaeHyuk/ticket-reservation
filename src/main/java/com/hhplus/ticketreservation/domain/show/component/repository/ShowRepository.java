package com.hhplus.ticketreservation.domain.show.component.repository;

import com.hhplus.ticketreservation.domain.show.model.Show;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ShowRepository {

    Show getShowById(Long id);

    Show save(Show show);

    List<Show> getShowsByEndDateAfter(LocalDate currentDate);
}
