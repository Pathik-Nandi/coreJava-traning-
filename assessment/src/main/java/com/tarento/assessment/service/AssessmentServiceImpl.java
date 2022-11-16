package com.tarento.assessment.service;

import com.tarento.assessment.data.AssessmentDao;
import com.tarento.assessment.dto.Assessment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AssessmentServiceImpl implements AssessmentService {

    @Autowired
    private AssessmentDao assessmentDao;
    @Override
    public long addAssessment(Assessment assessment) {
        return assessmentDao.addAssessment(assessment);
    }

    @Override
    public Assessment getAssessment(int assessmentId) {
        return assessmentDao.getAssessment(assessmentId);
    }
}
