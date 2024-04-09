package com.hhplus.ticketreservation.api.reservation;

import com.hhplus.ticketreservation.api.reservation.dto.request.ReservationRequest;
import com.hhplus.ticketreservation.api.reservation.dto.response.ReservationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @PostMapping
    public ResponseEntity<ReservationResponse> reservedShows(@RequestBody ReservationRequest reservationRequest){
        return ResponseEntity.ok(new ReservationResponse());
    }



}
