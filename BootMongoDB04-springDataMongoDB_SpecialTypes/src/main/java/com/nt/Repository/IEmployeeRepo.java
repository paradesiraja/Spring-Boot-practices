package com.nt.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.PlayerInfo;

public interface IEmployeeRepo extends MongoRepository<PlayerInfo, Integer> {

}
