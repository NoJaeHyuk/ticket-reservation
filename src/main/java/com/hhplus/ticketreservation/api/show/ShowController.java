package com.hhplus.ticketreservation.api.show;

import com.hhplus.ticketreservation.api.show.dto.response.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/show")
public class ShowController {

    @GetMapping
    public ResponseEntity<?> getShows(){
        return ResponseEntity.ok(new ShowsResponse());
    }


    @GetMapping("/{showId}")
    public ResponseEntity<ShowResponse> getShow(@PathVariable Long showId){
        return ResponseEntity.ok(new ShowResponse());
    }


    @GetMapping("/{show_id}/available-dates")
    public ResponseEntity<ReservationDatesResponse> getReservationDate(@PathVariable Long show_id) {
        return ResponseEntity.ok(new ReservationDatesResponse());
    }

    @GetMapping("/{show_id}/dates/{date}/performances")
    public ResponseEntity<RoundResponses> getPerformanceTimes(
            @PathVariable Long show_id,
            @PathVariable  LocalDate date) {
        return ResponseEntity.ok(new RoundResponses());
    }

    @GetMapping("/{show_id}/performances/{performanceId}/seats")
    public ResponseEntity<SeatResponses> getSeats(@PathVariable Long performanceId) {
        return ResponseEntity.ok(new SeatResponses());
    }
}
