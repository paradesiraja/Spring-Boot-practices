package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Medol;

public interface IMedolRepo extends MongoRepository<Medol, String> {

}
