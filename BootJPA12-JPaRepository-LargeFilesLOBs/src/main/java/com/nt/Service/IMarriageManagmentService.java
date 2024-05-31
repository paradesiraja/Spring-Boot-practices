package com.nt.Service;

import java.util.Optional;

import com.nt.Entity.MarriageSeeker;

public interface IMarriageManagmentService {

	public String registerMarriageSeeker(MarriageSeeker seeker);
	public Optional<MarriageSeeker> searchSeekerById(Long id);
}
