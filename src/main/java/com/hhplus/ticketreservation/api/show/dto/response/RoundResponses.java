package com.hhplus.ticketreservation.api.show.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public class RoundResponses {

    private List<RoundResponse> rounds;

    class RoundResponse {
        private Long id;
        private int order;
        private LocalDateTime dateTime;
    }
}
