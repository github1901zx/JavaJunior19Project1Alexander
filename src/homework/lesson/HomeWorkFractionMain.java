package homework.lesson;


public class HomeWorkFractionMain {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("************************************");
        System.out.println("   WELCOME TO FRACTION CALCULATOR");
        System.out.println("************************************");
        System.out.println();


        HomeWorkFraction fractA = new HomeWorkFraction(1, 1, 2);
        HomeWorkFraction fractB = new HomeWorkFraction(1, 3);

        HomeWorkFraction resultSum = HomeWorkFractionCalculator.sumFraction(fractA, fractB);

        resultSum.printFraction();

        HomeWorkFraction fractC = new HomeWorkFraction(1, 1, 2);
        HomeWorkFraction fractD = new HomeWorkFraction(1, 3);


        HomeWorkFraction resultDeff = HomeWorkFractionCalculator.differenceFraction(fractC, fractD);

        resultDeff.printFraction();

        HomeWorkFraction fractE = new HomeWorkFraction(1, 7, 2);
        HomeWorkFraction fractW = new HomeWorkFraction(4, 3);


        HomeWorkFraction resultDivision = HomeWorkFractionCalculator.multiplicationFraction(fractE, fractW);

        resultDivision.printFraction();

        HomeWorkFraction fractM = new HomeWorkFraction(1, 7, 2);
        HomeWorkFraction fractZ = new HomeWorkFraction(4, 3);


        HomeWorkFraction resultMlt = HomeWorkFractionCalculator.divisionFraction(fractM, fractZ);

        resultMlt.printFraction();


        System.out.println("********THANK YOU*********");

    }
}
