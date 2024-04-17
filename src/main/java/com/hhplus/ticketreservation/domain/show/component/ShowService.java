package com.hhplus.ticketreservation.domain.show.component;

import com.hhplus.ticketreservation.domain.show.component.repository.ShowRepository;
import com.hhplus.ticketreservation.domain.show.model.Show;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ShowService {

    private final ShowRepository showRepository;

    public Show getShowById(Long showId) {
        return showRepository.getShowById(showId);
    }

    public List<Show> getShows(LocalDate currentDate) {
        return showRepository.getShowsByEndDateAfter(currentDate);
    }
}
