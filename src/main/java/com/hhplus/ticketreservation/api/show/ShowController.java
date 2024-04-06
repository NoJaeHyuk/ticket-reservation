package com.hhplus.ticketreservation.api.show;

import com.hhplus.ticketreservation.api.show.dto.request.ReservationRequest;
import com.hhplus.ticketreservation.api.show.dto.response.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class ShowController {

    /**
     * 공연 조회
     */
    @GetMapping("/api/show/{showId}")
    public ResponseEntity<ShowResponse> getShow(@PathVariable Long showId){
        return ResponseEntity.ok(new ShowResponse());
    }


    /**
     * 예약가능 조회 기능
     *
     * @param show_id
     * @return
     */
    @GetMapping("/api/shows/{show_id}/reservations")
    public ResponseEntity<ReservationDatesResponse> getReservationDate(@PathVariable Long show_id) {
        return ResponseEntity.ok(new ReservationDatesResponse());
    }

    /**
     * 예약가능 날짜의 회차 정보 조회
     *
     * @param show_id
     * @param date
     * @return
     */
    @GetMapping("/api/shows/{show_id}/rounds")
    public ResponseEntity<RoundResponses> getReservationRound(
            @PathVariable Long show_id,
            @RequestParam(name = "date") LocalDate date) {
        return ResponseEntity.ok(new RoundResponses());
    }

    /**
     * 예약가능 좌석 조회
     * @param round_id
     * @return
     */
    @GetMapping("/api/shows/rounds/{round_id}/seats")
    public ResponseEntity<SeatResponses> getSeats(@PathVariable Long round_id) {
        return ResponseEntity.ok(new SeatResponses());
    }

    /**
     * 좌석 예약
     * @param reservationRequest
     * @return
     */
    @PostMapping("/api/shows/reservations")
    public ResponseEntity<ReservationResponse> reservedShows(@RequestBody ReservationRequest reservationRequest){
        return ResponseEntity.ok(new ReservationResponse());
    }
}
