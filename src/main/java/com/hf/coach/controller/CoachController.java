package com.hf.coach.controller;

import com.hf.coach.entity.CoachEntity;
import com.hf.coach.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coaches")
public class CoachController {

    @Autowired
    private CoachService cs;

    @GetMapping("/getall")
    public ResponseEntity<List<CoachEntity>> getAllCoaches() {
        List<CoachEntity> coaches = cs.getAllCoaches();
        return ResponseEntity.ok(coaches);
    }

    @GetMapping("/{coachId}")
    public ResponseEntity<CoachEntity> getCoachById(@PathVariable Long coachId) {
        CoachEntity coach = cs.getCoachById(coachId);
        if (coach != null) {
            return ResponseEntity.ok(coach);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/upload")
    public ResponseEntity<CoachEntity> createCoach(@RequestBody CoachEntity ce) {
        CoachEntity createdCoach = cs.createCoach(ce);
        return ResponseEntity.ok(createdCoach);
    }

    @DeleteMapping("/{coachId}")
    public ResponseEntity<Void> deleteCoach(@PathVariable Long coachId) {
        cs.deleteCoach(coachId);
        return ResponseEntity.noContent().build();
    }
}
