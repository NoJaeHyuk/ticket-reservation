package com.hhplus.ticketreservation.api.show.dto.response;

import com.hhplus.ticketreservation.domain.show.model.Show;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ShowResponse {

    private Long id;
    private String title;
    private String content;

    @Builder
    private ShowResponse(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public static ShowResponse from(Show show){
        return ShowResponse.builder()
                .id(show.getId())
                .title(show.getTitle())
                .content(show.getContent())
                .build();
    }
}
