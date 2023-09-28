package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

@Service
public class EventService {

    @Autowired
    EventRepo eventRepo;

    public String addEvent(Event event) {
        eventRepo.save(event);
        return "event added";
    }

    public String updateEvent(Integer eventId, Event event) {
        eventRepo.save(event);
        return "Event updated";
    }

    public String deleteEvent(Integer eventId) {
        eventRepo.deleteById(eventId);
        return "event deleted";
    }

    public List<Event> getEventsByDate(LocalDate date) {

        return eventRepo.findByEventDate(date);
    }

}
