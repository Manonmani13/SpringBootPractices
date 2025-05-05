package com.example.sb_rest_errail_api;

import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class ErailRestController {

    private Map<Integer, Ticket> tickets = new HashMap<>();

    @PostMapping(
        value = "/ticket",
        consumes = {"application/xml", "application/json"},
        produces = {"application/xml", "application/json"}
    )
    public Ticket booTicket(@RequestBody Passenger passenger, HttpServletRequest request) {
        Ticket t = new Ticket();
        t.setFrom(passenger.getFrom());
        t.setTo(passenger.getTo());
        Random r = new Random();
        t.setTicketId(r.nextInt(100000));
        t.setTicketStatus("CONFIRMED");
        t.setTktCost("1500.00 INR");
        t.setTrialNum(passenger.getTrainNum());
        tickets.put(t.getTicketId(), t);

        // Use request object
        System.out.println("Request IP: " + request.getRemoteAddr());

        return t;
    }

    @GetMapping(
        value = "/ticket/{ticketId}",
        produces = {"application/xml", "application/json"}
    )
    public Ticket getTicket(@PathVariable Integer ticketId) {
        return tickets.getOrDefault(ticketId, null);
    }
}
