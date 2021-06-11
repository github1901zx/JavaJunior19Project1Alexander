package homework.lesson.additionaltask;

public class Journal extends PrintEdition {

    Article articles []  = new Article[6];

    public Journal(){

    }
    public Journal (String name, String publishingHouse,String author, int numberOfPages){
        setName(name);
        setPublishingHouse(publishingHouse);
        setAuthor(author);
        setNumberOfPages(numberOfPages);

    }
    public void addArticles(Article article){
        for(int i = 0 ;i < articles.length;i++){
            if(articles[i] == null){
                articles[i] = article;
                break;
            }


        }
    }
    public void printJournal(){
        System.out.println(getName());
        for(int i = 0 ; i < articles.length;i++){
            if(articles[i] != null){

                System.out.println(articles[i].getText());
            }
        }
    }
}
