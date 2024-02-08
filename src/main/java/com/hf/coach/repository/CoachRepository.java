package com.hf.coach.repository;

import com.hf.coach.entity.CoachEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends JpaRepository<CoachEntity, Long> {
    // Add custom queries if needed
}
