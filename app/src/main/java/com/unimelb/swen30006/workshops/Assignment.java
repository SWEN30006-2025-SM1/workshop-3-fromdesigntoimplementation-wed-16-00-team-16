package com.unimelb.swen30006.workshops;

public class Assignment {
    private String assessmentInstructions;
    private String uploadType;
    private boolean visibility;

    public void setAssessmentInstructions(String instructions) {
        this.assessmentInstructions = instructions;
    }

    public void setUploadType(String type) {
        this.uploadType = type;
    }

    public void setVisibility(boolean visible) {
        this.visibility = visible;
    }

    public String getInstructions() {
        return assessmentInstructions;
    }

    public boolean isVisible() {
        return visibility;
    }
}

