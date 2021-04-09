package lession9;

public class Test {
    private String picture;
    private String testName;
    private String descriptionTest;
    private Question[] questionsTest = new Question[2];

    public Test(){}

    public Test(String pic, String nameTest, String testDescription){
        this.picture = pic;
        this.testName = nameTest;
        this.descriptionTest = testDescription;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setDescriptionTest(String descriptionTest) {
        this.descriptionTest = descriptionTest;
    }

    public String getDescriptionTest() {
        return descriptionTest;
    }

    public void addQuestion (Question questions){

        for(int i = 0; i < questionsTest.length; i++){
            if(questionsTest[i] == null){
                questionsTest[i] = questions;
                break;
            }
        }
    }
}
