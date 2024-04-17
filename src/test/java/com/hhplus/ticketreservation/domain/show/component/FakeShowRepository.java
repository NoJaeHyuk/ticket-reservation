package com.hhplus.ticketreservation.domain.show.component;

import com.hhplus.ticketreservation.domain.show.component.repository.ShowRepository;
import com.hhplus.ticketreservation.domain.show.model.Show;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class FakeShowRepository implements ShowRepository {
    private AtomicLong atomicGeneratedId = new AtomicLong(0);
    private Map<Long, Show> data = new HashMap<>();

    @Override
    public Show getShowById(Long id) {
        Show show = data.get(id);

        if (show == null) {
            new RuntimeException("Show not find data");
        }

        return show;
    }

    @Override
    public Show save(Show show) {
        long newId = atomicGeneratedId.incrementAndGet();

        Show savedShow = Show.builder()
                .id(newId)
                .title(show.getTitle())
                .content(show.getContent())
                .performer(show.getPerformer())
                .place(show.getPlace())
                .startDate(show.getStartDate())
                .endDate(show.getEndDate())
                .build();

        data.put(newId, savedShow);
        return savedShow;
    }

    @Override
    public List<Show> getShowsByEndDateAfter(LocalDate currentDate) {
        return data.values().stream()
                .filter(element -> !element.getEndDate().isBefore(currentDate)).toList();
    }
}
