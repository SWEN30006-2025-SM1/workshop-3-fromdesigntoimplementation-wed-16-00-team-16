package com.unimelb.swen30006.workshops;



public class Instructor {
    private String LMSUsername;
    private String LMSPassword;

    public Instructor(String username, String password) {
        this.LMSUsername = username;
        this.LMSPassword = password;
    }

    public String getUsername() {
        return LMSUsername;
    }

    // Simulate assignment creation using a String (PDF file path or name)
    public Assignment createAssignment(String PDF) {
        return new Assignment();
    }

    // Set assignment visibility
    public void setVisibility(Assignment assignment, boolean visible) {
        assignment.setVisibility(visible);
        System.out.println("Assignment visibility set to: " + visible);
    }
}
