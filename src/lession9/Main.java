package lession9;

import java.util.Scanner;

// TODO: 18.03.2021
public class Main {
    public static void main(String[] args) {

        //thirst option
        AnswerOptions option1 = new AnswerOptions("in",true);
        AnswerOptions option2 = new AnswerOptions("do",false);
        AnswerOptions option3 = new AnswerOptions("on",false);
        AnswerOptions option4 = new AnswerOptions("by",false);

        //two option
        AnswerOptions option5 = new AnswerOptions("don't",false);
        AnswerOptions option6 = new AnswerOptions("not",false);
        AnswerOptions option7 = new AnswerOptions("doesn't",true);
        AnswerOptions option8 = new AnswerOptions("no",false);


        Question ques1 = new Question (" My grandmother started work .....1960 ");//" My grandmother started work .....1960 "
        ques1.addOptionQuestion(option1);
        ques1.addOptionQuestion(option2);
        ques1.addOptionQuestion(option3);
        ques1.addOptionQuestion(option4);

        Question ques2 = new Question (" She ... like football");
        ques2.addOptionQuestion(option4);
        ques2.addOptionQuestion(option6);
        ques2.addOptionQuestion(option7);
        ques2.addOptionQuestion(option8);

        Test testOne = new Test();

        testOne.setPicture("http://easy-it-courses.com/resources/images/tests/icons/Test1.png");
        testOne.setDescriptionTest("В современном мире знание английского языка является неотъемлемой частью успешного профессионального роста. Если Вы хотите: открыть свой бизнес; занимать руководящую должность в крупной компании; быть успешным менеджером, как в Украине, так и за рубежом; или, в конце концов, стать высокооплачиваемым специалистом в сфере IT – Вы просто обязаны владеть английским языком на достойном уровне!\n" +
                "\n" +
                "Вы хотите узнать свой уровень английского языка онлайн? Тогда компания Easy IT предлагает Вам пройти специальный тест, результат которого покажет Ваш уровень владения английским по международной классификации от уровня А1 (Beginner) до С2 (Advanced).");
        testOne.setTestName("\"Тест \\\"Определите уровень английского языка\\\"\"");
        testOne.addQuestion(ques1);
        testOne.addQuestion(ques2);


        Scanner scanner1 = new Scanner(System.in);
        System.out.println(testOne.getTestName());
        ques1.printQuestion();
        System.out.println("Введите Ваш ответ:");
        int answer1 = scanner1.nextInt();

        ques2.printQuestion();
        System.out.println("Введите Ваш ответ:");
        int answer2 = scanner1.nextInt();

        boolean isTrue1 = false;
        for(int i = 0; i < ques1.getOptions().length; i++){
            if(ques1.getOptions()[i].isAnswer()){
                if(i == answer1){
                    System.out.println("Первый ответ верный");
                    isTrue1 = true;
                }

            }
        }

        if(!isTrue1){
            System.out.println("Первый вопрос не верный");
        }

        boolean isTrue2 = false;
        for(int i = 0; i < ques2.getOptions().length; i++){
            if(ques2.getOptions()[i].isAnswer()){
                if(i == answer2){
                    System.out.println("Второй ответ верный");
                    isTrue2 = true;
                }

            }
        }

        if(!isTrue2){
            System.out.println("Второй вопрос не верный");
        }

    }
}
