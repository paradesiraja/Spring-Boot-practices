package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Sport;

import lombok.NonNull;

public interface ISportRepo extends MongoRepository<Sport, Integer> {

}
