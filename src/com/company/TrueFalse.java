package com.company;

public class TrueFalse extends Question {
    private boolean choice;
    private boolean answer;

    public boolean isChoice() {
        return choice;
    }

    public void setChoice(boolean choice) {
        this.choice = choice;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public TrueFalse(String theQuestion, boolean b) {
        super(theQuestion);
    }

    @Override
    public String getAnswer() {
        return null;
    }

    public void trueFalse(String aChoice, boolean aAnswer){
        this.choice = choice;
        this.answer = answer;
    }
}
