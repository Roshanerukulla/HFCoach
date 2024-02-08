package com.hf.coach.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hf.coach.entity.CoachEntity;


@Service
public interface CoachService {
	    List<CoachEntity> getAllCoaches();
	    CoachEntity getCoachById(Long coachId);
	    CoachEntity createCoach(CoachEntity coach);
	    void deleteCoach(Long coachId);
	}

