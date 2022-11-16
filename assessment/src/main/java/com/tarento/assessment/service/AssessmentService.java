package com.tarento.assessment.service;

import com.tarento.assessment.dto.Assessment;

public interface AssessmentService {
    public long addAssessment(Assessment assessment);
    public Assessment getAssessment(int assessmentId);
}
