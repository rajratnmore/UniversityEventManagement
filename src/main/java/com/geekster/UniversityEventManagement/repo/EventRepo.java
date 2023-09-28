package com.geekster.UniversityEventManagement.repo;

import com.geekster.UniversityEventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.time.LocalDate;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {

    List<Event> findByEventDate(LocalDate date);
}
