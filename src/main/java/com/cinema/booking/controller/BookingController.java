package com.cinema.booking.controller;

import com.cinema.booking.model.Ticket;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/cinema")

public class BookingController {
    List<Ticket> ticketList = new ArrayList<>();

    @RequestMapping(path = "/tickets", method = RequestMethod.POST)
    public Ticket addTicket(@RequestBody Ticket ticket) {
        ticketList.add(ticket);
        return ticket;
    }

    @RequestMapping(path = "/tickets", method = RequestMethod.GET)
    public List<Ticket> getTicket(@RequestBody Ticket ticket) {
        System.out.println("controller called");
        ticketList.add(ticket);
        return ticketList;
    }
}
