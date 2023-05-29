package com.xworkzz.movieapp;

import com.xworkzz.movieapp.ticketapp.Ticket;

public class MovieTester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Movie movie = new Movie(ticket);
        Movie.ticket.toSee();
    }
}
