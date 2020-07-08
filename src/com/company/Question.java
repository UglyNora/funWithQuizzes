package com.company;


public abstract class Question {
    private String theQuestion;

    public Question() {

    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public Question(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public abstract String getAnswer();
}
