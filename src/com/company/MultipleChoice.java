package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question{
   private ArrayList<String>choices;
   private String answer;

//   public MultipleChoice(ArrayList<String> choices, String answer) {
//      this.choices = choices;
//      this.answer = answer;
//   }

   public MultipleChoice(String theQuestion, ArrayList<String>choices , String answer) {
      super(theQuestion);
      this.choices = choices;
      this.answer = answer;
   }

   public MultipleChoice(String theQuestion) {
      super(theQuestion);
   }

   public MultipleChoice() {
      super();
   }

   public ArrayList<String>  getChoices() {
      return choices;
   }

   public void setChoices(ArrayList<String>  choices) {
      this.choices = choices;
   }

   public String getAnswer() {
      return answer;
   }

   public void setAnswer(String answer) {
      this.answer = answer;
   }
}
