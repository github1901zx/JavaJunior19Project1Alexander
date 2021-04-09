package lession9;

import javax.swing.text.html.Option;

public class Question {
    private String questionTit;
    private AnswerOptions[] options = new AnswerOptions[4];

    public Question(){}

    public Question(String questionText1){
        this.questionTit = questionText1;
    }

    public void setQuestionTit(String text){
        this.questionTit = text;
    }

    public String getQuestionTit(){
        return this.questionTit;
    }

    public AnswerOptions[] getOptions() {
        return options;
    }

    public void setOptions(AnswerOptions[] options) {
        this.options = options;
    }

    public void addOptionQuestion (AnswerOptions option){
        for(int i = 0; i < options.length;i++){
            if(options[i] == null){
                options[i] = option;
                break;
            }
        }
    }

    public void printQuestion (){
        System.out.println(questionTit);
        for(int i = 0; i < options.length; i++){
            if(options[i] != null){

                System.out.println( (i) + " - " + options[i].getOption());
            }
        }
    }


}
