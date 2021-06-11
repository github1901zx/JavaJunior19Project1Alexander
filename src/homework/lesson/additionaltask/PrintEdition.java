package homework.lesson.additionaltask;

public class PrintEdition extends Object {

    private String name;
    private String publishingHouse;
    private String author;
    private int numberOfPages;


    public PrintEdition() {
        //default
    }

    public PrintEdition(String name, String publishingHouse, String author, int numberOfPages) {
        this.name = name;
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return this.name;
    }

    public String getPublishingHouse() {
        return this.publishingHouse;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void printInfoEdition() {
        System.out.println("Name edition " + this.name +
                "\n" + "Publishing house " + this.publishingHouse +
                "\n" + "Author " + this.author +
                "\n" + "Count pages " + this.numberOfPages);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintEdition that = (PrintEdition) o;

        if (numberOfPages != that.numberOfPages) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (publishingHouse != null ? !publishingHouse.equals(that.publishingHouse) : that.publishingHouse != null)
            return false;
        return author != null ? author.equals(that.author) : that.author == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + numberOfPages;
        return result;
    }
}
