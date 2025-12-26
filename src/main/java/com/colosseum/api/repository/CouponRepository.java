package com.colosseum.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colosseum.api.domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
