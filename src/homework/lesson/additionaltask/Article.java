package homework.lesson.additionaltask;

public class Article extends PrintEdition {
    private String text;
    private int contSymbols;

    public Article(){

    }
    public Article (String name, String publishingHouse,String author,String text, int contSymbols){
        setName(name);
        setPublishingHouse(publishingHouse);
        setAuthor(author);
        this.text = text;
        this.contSymbols = contSymbols;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getContSymbols() {
        return contSymbols;
    }

    public void setContSymbols(int contSymbols) {
        this.contSymbols = contSymbols;
    }

    public void printText(String text){
        this.text = text;
        System.out.println(text);
    }

}
