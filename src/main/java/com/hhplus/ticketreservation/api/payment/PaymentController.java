package com.hhplus.ticketreservation.api.payment;

import com.hhplus.ticketreservation.api.payment.dto.request.PaymentRequest;
import com.hhplus.ticketreservation.api.payment.dto.response.PaymentResponse;
import com.hhplus.ticketreservation.api.payment.dto.response.PaymentsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @PostMapping
    public ResponseEntity<PaymentResponse> paymentShow(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok().body(new PaymentResponse());
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<PaymentResponse> getPayment(@PathVariable Long paymentId) {
        return ResponseEntity.ok().body(new PaymentResponse());
    }

    @GetMapping
    public ResponseEntity<PaymentsResponse> getPayments(){
        return ResponseEntity.ok().body(new PaymentsResponse());
    }
}
