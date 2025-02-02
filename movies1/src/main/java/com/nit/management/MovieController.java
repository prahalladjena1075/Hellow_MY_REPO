package com.nit.management;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import service.BookingService;
import service.MovieService;
import type.Booking;
import type.Movie;

@Controller
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private BookingService bookingService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "index";
    }

    @GetMapping("/book/{id}")
    public String book(@PathVariable Long id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "book";
    }

    @PostMapping("/book/{id}")
    public String bookTicket(@PathVariable Long id, @RequestParam String name) {
        Movie movie = movieService.getMovieById(id);
        if (movie != null && movie.getSeatsAvailable() > 0) {
            movie.setSeatsAvailable(movie.getSeatsAvailable() - 1);
            movieService.saveMovie(movie);
            
            Booking booking = new Booking();
            booking.setName(name);
            booking.setMovieId(id);
            bookingService.saveBooking(booking);
            
            return "redirect:/confirmation/" + booking.getId();
 }
        return "redirect:/book/" + id;
    }

    @GetMapping("/confirmation/{id}")
    public String confirmation(@PathVariable Long id, Model model) {
        Booking booking = bookingService.getBookingById(id);
        model.addAttribute("booking", booking);
        return "confirmation";
    }
}
