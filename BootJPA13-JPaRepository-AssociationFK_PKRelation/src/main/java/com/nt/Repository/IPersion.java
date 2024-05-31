package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PhoneNumber;

public interface IPersion extends JpaRepository<PhoneNumber, Integer> {

}
