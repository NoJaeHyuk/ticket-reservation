package com.hhplus.ticketreservation.api.show.dto.response;

import com.hhplus.ticketreservation.domain.show.model.Show;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ShowsResponse {

    private List<ShowResponse> shows;

    @Builder
    private ShowsResponse(List<ShowResponse> shows) {
        this.shows = shows;
    }

    public static ShowsResponse from(List<Show> shows) {
        List<ShowResponse> showResponses = shows.stream()
                .map(ShowResponse::from).collect(Collectors.toList());

        return ShowsResponse.builder()
                .shows(showResponses)
                .build();
    }
}
