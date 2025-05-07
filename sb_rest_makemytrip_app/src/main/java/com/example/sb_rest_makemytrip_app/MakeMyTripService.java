package com.example.sb_rest_makemytrip_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
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

    public void getTicketInfoSync(String ticketId){
        System.out.println("Sync - method  ended......");
        WebClient client=WebClient.create();

        String res=client.get()
                    .uri(IRCTC_ENDPOINT_1,ticketId)
                    .accept(MediaType.APPLICATION_JSON)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

        System.out.println(res);
        System.out.println("Sync - method ended ....");
    }

    public void getTicketSync(String ticketId){
        System.out.println("Sync - method  ended......");
        WebClient client=WebClient.create();

             client.get()
                    .uri(IRCTC_ENDPOINT_1,ticketId)
                    .accept(MediaType.APPLICATION_JSON)
                    .retrieve()
                    .bodyToMono(String.class)
                    .subscribe(response -> handleResponse(response));

        System.out.println("Sync - method ended ....");
    }

    public void handleResponse(String res){
        
        System.out.println(res);
    }
   
}
