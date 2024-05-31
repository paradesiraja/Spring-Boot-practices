package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Persion;

public interface IPhoneNumber extends JpaRepository<Persion, Integer> {

}
