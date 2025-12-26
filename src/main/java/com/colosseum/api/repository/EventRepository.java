package com.colosseum.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colosseum.api.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, UUID> {

}
