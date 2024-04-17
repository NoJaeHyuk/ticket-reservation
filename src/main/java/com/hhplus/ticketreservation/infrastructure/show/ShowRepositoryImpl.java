package com.hhplus.ticketreservation.infrastructure.show;

import com.hhplus.ticketreservation.domain.show.component.repository.ShowRepository;
import com.hhplus.ticketreservation.domain.show.model.Show;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
public class ShowRepositoryImpl implements ShowRepository {

    private final ShowJpaRepository showJpaRepository;

    @Override
    public Show getShowById(Long id) {
        return showJpaRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Find Show Entity"));
    }

    @Override
    public Show save(Show show) {
        return showJpaRepository.save(show);
    }

    @Override
    public List<Show> getShowsByEndDateAfter(LocalDate currentDate) {
        return showJpaRepository.findByEndDateAfter(currentDate);
    }

}
