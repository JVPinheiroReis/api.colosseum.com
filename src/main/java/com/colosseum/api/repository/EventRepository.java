package com.colosseum.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colosseum.api.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
