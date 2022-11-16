package com.tarento.assessment.service;

import com.tarento.assessment.dto.Assessment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AssessmentController {
    @Autowired
    private AssessmentService assessmentService;
    @PostMapping("/addAssessment")
    public long addAssessment(@RequestBody Assessment assessment)
    {
        return assessmentService.addAssessment(assessment);
    }
    @GetMapping("/getAssessment/{assessmentId}")
    public Assessment getAssessment(@PathVariable int assessmentId)
    {
        return assessmentService.getAssessment(assessmentId);
    }

}
