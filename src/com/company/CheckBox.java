package com.company;

public class CheckBox extends Question {
    public String[] getChoice() {
        return choice;
    }

    public void setChoice(String[] choice) {
        this.choice = choice;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    private String[] choice;
    private String  answer;

    public CheckBox(String theQuestion) {
        super(theQuestion);
    }
}
