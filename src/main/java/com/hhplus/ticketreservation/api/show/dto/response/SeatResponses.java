package com.hhplus.ticketreservation.api.show.dto.response;

import java.util.List;

public class SeatResponses {

    private List<SeatResponse> seats;


    class SeatResponse {
        private Long id;
        private int seatNumber;
        private String status;
    }
}
