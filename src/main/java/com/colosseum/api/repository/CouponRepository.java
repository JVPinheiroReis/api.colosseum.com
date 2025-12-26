package com.colosseum.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colosseum.api.domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {

}
