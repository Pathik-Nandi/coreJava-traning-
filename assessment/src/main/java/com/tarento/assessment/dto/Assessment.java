package com.tarento.assessment.dto;

public class Assessment {
    private int assessmentId;
    private  String assessmentName;
    private int MaxScore;

    public Assessment() {
    }

    public Assessment(int assessmentId, String assessmentName, int maxScore) {
        this.assessmentId = assessmentId;
        this.assessmentName = assessmentName;
        MaxScore = maxScore;
    }

    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getAssessmentName() {
        return assessmentName;
    }

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    public int getMaxScore() {
        return MaxScore;
    }

    public void setMaxScore(int maxScore) {
        MaxScore = maxScore;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "assessmentId=" + assessmentId +
                ", assessmentName='" + assessmentName + '\'' +
                ", MaxScore=" + MaxScore +
                '}';
    }
}
