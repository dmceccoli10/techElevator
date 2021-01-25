package com.techelevator;

public class HomeworkAssignment {

    private Integer earnedMarks;
    private Integer possibleMarks;
    private String submitterName;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
            this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }


    public String getLetterGrade() {
        if (earnedMarks * 100 / possibleMarks >= 90) {
            return "A";
        } else if (earnedMarks * 100 / possibleMarks >= 80) {
            return "B";
        } else if (earnedMarks * 100 / possibleMarks >= 70) {
            return "C";
        } else if (earnedMarks * 100 / possibleMarks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


}
