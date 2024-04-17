package com.hhplus.ticketreservation.api.show;

import com.hhplus.ticketreservation.api.show.dto.response.*;
import com.hhplus.ticketreservation.domain.show.component.ShowService;
import com.hhplus.ticketreservation.domain.show.model.Show;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/show")
@RequiredArgsConstructor
public class ShowController {

    private final ShowService showService;

    @GetMapping
    public ResponseEntity<ShowsResponse> getShows() {
        List<Show> shows = showService.getShows(LocalDate.now());
        return ResponseEntity.ok(ShowsResponse.from(shows));
    }


    @GetMapping("/{showId}")
    public ResponseEntity<ShowResponse> getShow(@PathVariable Long showId) {
        Show show = showService.getShowById(showId);
        return ResponseEntity.ok(ShowResponse.from(show));
    }


    @GetMapping("/{show_id}/available-dates")
    public ResponseEntity<ReservationDatesResponse> getReservationDate(@PathVariable Long show_id) {
        return ResponseEntity.ok(new ReservationDatesResponse());
    }

    @GetMapping("/{show_id}/dates/{date}/performances")
    public ResponseEntity<RoundResponses> getPerformanceTimes(
            @PathVariable Long show_id,
            @PathVariable LocalDate date) {
        return ResponseEntity.ok(new RoundResponses());
    }

    @GetMapping("/{show_id}/performances/{performanceId}/seats")
    public ResponseEntity<SeatResponses> getSeats(@PathVariable Long show_id, @PathVariable Long performanceId) {
        return ResponseEntity.ok(new SeatResponses());
    }
}
