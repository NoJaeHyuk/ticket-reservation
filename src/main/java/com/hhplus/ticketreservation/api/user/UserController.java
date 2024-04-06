package com.hhplus.ticketreservation.api.user;

import com.hhplus.ticketreservation.api.user.dto.response.TokenResponse;
import com.hhplus.ticketreservation.api.user.dto.response.WaitingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * 대기열 진입 시 (처음) 대기열 큐에 추가 기능
     * @param userId
     * @param showId
     * @return
     */
    @PostMapping("/api/user/queue")
    public ResponseEntity<WaitingResponse> addWaitingQueue(
            @RequestParam Long userId, @RequestParam Long showId
    ){
        return ResponseEntity.ok(new WaitingResponse());
    }

    /**
     * 대기열 조회 기능
     * @param userId
     * @param showId
     * @return
     */
    @GetMapping("/api/user/queue")
    public ResponseEntity<WaitingResponse> checkQueue(
            @RequestParam Long userId, @RequestParam Long showId
    ){
        return ResponseEntity.ok(new WaitingResponse());
    }


    /**
     * 대기열 통과 시 토큰 생성
     * @param userId
     * @param showId
     * @return
     */
    @PostMapping("/api/user/token")
    public ResponseEntity<TokenResponse> createToken(@RequestParam Long userId, @RequestParam Long showId) {
        return ResponseEntity.ok(new TokenResponse());
    }
}
