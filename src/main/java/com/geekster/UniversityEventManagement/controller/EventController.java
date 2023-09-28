package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.time.LocalDate;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("/events")
    public String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

    @PutMapping("eventId/{eventId}")
    public String updateEvent(@PathVariable Integer eventId, @RequestBody Event event){
    return eventService.updateEvent(eventId, event);
    }

    @DeleteMapping("eventId/{eventId}")
    public String deleteEvent(@PathVariable Integer eventId){
        return eventService.deleteEvent(eventId);
    }

    @GetMapping("/byDate")
    public List<Event> getEventsByDate(@RequestParam("date") LocalDate date) {
        return eventService.getEventsByDate(date);
    }

}
