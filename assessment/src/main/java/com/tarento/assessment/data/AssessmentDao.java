package com.tarento.assessment.data;

import com.tarento.assessment.dto.Assessment;

public interface AssessmentDao {
    public long addAssessment(Assessment assessment);
    public Assessment getAssessment(int assessmentId);
}
