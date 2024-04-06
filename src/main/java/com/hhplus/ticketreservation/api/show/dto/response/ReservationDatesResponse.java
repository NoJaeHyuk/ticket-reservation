package com.hhplus.ticketreservation.api.show.dto.response;

import java.time.LocalDate;
import java.util.List;

public class ReservationDatesResponse {

    List<DateResponse> dateResponses;

    class DateResponse {
        private LocalDate date;
        private String status;
    }
}