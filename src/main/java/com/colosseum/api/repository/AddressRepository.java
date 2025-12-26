package com.colosseum.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colosseum.api.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}
