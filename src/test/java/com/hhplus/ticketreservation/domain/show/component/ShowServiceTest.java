package com.hhplus.ticketreservation.domain.show.component;

import com.hhplus.ticketreservation.domain.show.component.repository.ShowRepository;
import com.hhplus.ticketreservation.domain.show.model.Show;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class ShowServiceTest {

    private ShowService showService;
    private ShowRepository showRepository;

    @BeforeEach
    void setUp() {
        showRepository = new FakeShowRepository();
        showService = new ShowService(showRepository);
    }

    @DisplayName("Show엔티티 값을 식별자를 통해 값을 조회한다.")
    @Test
    void getShowById() {
        // given
        Show show = Show.builder()
                .title("아이유 콘서트")
                .place("상암경기장")
                .build();

        Show savedShow = showRepository.save(show);

        // when
        Show shows = showService.getShowById(savedShow.getId());

        // then
        assertThat(shows.getId()).isNotNull();
        assertThat(shows.getTitle()).isEqualTo("아이유 콘서트");
    }


    @DisplayName("")
    @Test
    void getShows() {
        // given
        Show show1 = Show.builder()
                .title("아이유 콘서트1")
                .place("상암경기장")
                .endDate(LocalDate.of(2024, 4, 17))
                .build();

        Show show2 = Show.builder()
                .title("아이유 콘서트2")
                .place("상암경기장")
                .endDate(LocalDate.of(2024, 4, 18))
                .build();

        Show show3 = Show.builder()
                .title("아이유 콘서트3")
                .place("상암경기장")
                .endDate(LocalDate.of(2024, 4, 19))
                .build();

        showRepository.save(show1);
        showRepository.save(show2);
        showRepository.save(show3);

        LocalDate currentDate = LocalDate.of(2024, 4, 18);

        // when
        List<Show> shows = showService.getShows(currentDate);

        // then
        assertThat(shows).hasSize(2)
                .extracting("title", "endDate")
                .containsExactlyInAnyOrder(
                        tuple("아이유 콘서트2", LocalDate.of(2024, 4, 18)),
                        tuple("아이유 콘서트3", LocalDate.of(2024, 4, 19))
                );
    }
}