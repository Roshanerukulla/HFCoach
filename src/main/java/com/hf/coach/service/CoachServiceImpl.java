package com.hf.coach.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hf.coach.entity.CoachEntity;
import com.hf.coach.repository.CoachRepository;
@Service
public class CoachServiceImpl implements CoachService {
    @Autowired
	private CoachRepository cr;
	@Override
	public List<CoachEntity> getAllCoaches() {
		return cr.findAll();		
	}

	@Override
	public CoachEntity getCoachById(Long coachId) {
		// TODO Auto-generated method stub
		 Optional<CoachEntity> optionalCoach = cr.findById(coachId);
	        return optionalCoach.orElse(null);
	}

	@Override
	public CoachEntity createCoach(CoachEntity coach) {
		return cr.save(coach);
	}

	@Override
	public void deleteCoach(Long coachId) {
		cr.deleteById(coachId);
		
	}

}
