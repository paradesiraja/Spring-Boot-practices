package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.MarriageSeeker;

public interface IMarriageRepository extends JpaRepository<MarriageSeeker, Long>{

}
