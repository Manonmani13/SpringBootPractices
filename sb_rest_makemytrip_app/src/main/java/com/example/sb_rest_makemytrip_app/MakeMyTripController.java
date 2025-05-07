package com.example.sb_rest_makemytrip_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MakeMyTripController {
    
    @Autowired
    private MakeMyTripService service;
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }

    @GetMapping("/searchTicket")
    public String getMethodName(@RequestParam("ticketId") String ticketId,Model model) {
        Ticket tick=service.getTicketInfo(ticketId);
        model.addAttribute("ticket",tick);
        return new String();
    }
    
    
    @PostMapping("/bookTicket")
    public String postMethodName(@RequestBody Passenger request,Model model) {
         
        Ticket ticket=service.processTicketBooking(request);
        return "success";
    }
    
}
