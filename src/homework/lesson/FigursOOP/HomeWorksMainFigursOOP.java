package homework.lesson.FigursOOP;

public class HomeWorksMainFigursOOP {

    public static void main(String[] args) {

        HomeWorkFigurs trg1 = new Triangle(2,3,2);
        HomeWorkFigurs crl = new Сircle(5);
        HomeWorkFigurs elps1 = new Ellipse(4,5);
        HomeWorkFigurs sqr = new Square(6,6,6,6);
        HomeWorkFigurs rec1 = new Rectangle(2,4,2,4);


        HomeWorkFigurs[] figrs = new HomeWorkFigurs[5];

        figrs[0]= trg1;
        figrs[1]= crl;
        figrs[2]= elps1;
        figrs[3]= sqr;
        figrs[4]= rec1;

        for (HomeWorkFigurs figr : figrs){
            figr.figureIdentification();
            System.out.println("***************************");
        }

    }
}
