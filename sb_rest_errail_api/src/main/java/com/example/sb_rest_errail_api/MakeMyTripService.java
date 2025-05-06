package com.example.sb_rest_errail_api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MakeMyTripService {
    @Value("${irctc.endpoint.book_ticket}")
    private static  String IRCTC_ENDPOINT_1;

    @Value("${irctc.endpoint.get.ticket}")

    private static  String IRCTC_ENDPOINT_2;


    public Ticket processTicketBooking(Passenger passenger){
        RestTemplate rt=new RestTemplate();
        ResponseEntity<Ticket> responseEntity=rt.postForEntity(IRCTC_ENDPOINT_1, passenger, Ticket.class);
        int statusCode=responseEntity.getStatusCodeValue();
        if(statusCode==200){
            Ticket ticket=responseEntity.getBody();
            return ticket;
        }
        return null;
    }

    public Ticket getTicketInfo(String ticketId){
        RestTemplate rt=new RestTemplate();

        ResponseEntity<Ticket> responseEntity=rt.postForEntity(IRCTC_ENDPOINT_2, Ticket.class, Ticket.class);
        int statusCode=responseEntity.getStatusCodeValue();
        if(statusCode==200){
            Ticket ticket=responseEntity.getBody();
            return ticket;
        }
        return null;
    }

    public Ticket getTicketInfos(String ticketId){
        WebClient wc=WebClient.create();
        Ticket ticket=wc.get()
            .uri(IRCTC_ENDPOINT_1)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Ticket.class)
            .block();

        if(ticket!=null)
        return ticket;
        return null;
    }

    public Ticket processTicketBookings(Passenger passenger){
        WebClient wc=WebClient.create();
        Ticket ticket=wc.post()
            .uri(IRCTC_ENDPOINT_2)
            .body(BodyInserters.fromValue(passenger))
            .header("Content-Type","application/json")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Ticket.class)
            .block();

        if(ticket!=null)
        return ticket;
        return null;
    }
}
