package com.nt.repo.promotions;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Promotions.Offers;

public interface IOfferRepo extends JpaRepository<Offers, Integer> {

}
