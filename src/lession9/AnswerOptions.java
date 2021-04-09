package lession9;

public class AnswerOptions {
    private String option;
    private boolean answer;


    public AnswerOptions (){}//default constructor

    public AnswerOptions(String Option,boolean Answer){
        this.option = Option;
        this.answer = Answer;
    }

    public void setAnswer(boolean answer) {

        this.answer = answer;
    }

    public void setOption(String option) {

        this.option = option;
    }
    public String getOption (){

        return this.option;
    }
    public boolean getAnswer (){

        return this.answer;
    }

    public boolean isAnswer() {
        return answer;
    }
}
