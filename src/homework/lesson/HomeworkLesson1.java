package homework.lesson;

public class HomeworkLesson1 {
    public static void main(String[] args) {
        int moneyAmount = 1000;
        int pizzaCost = 230;
        int gumCost = 26;
        double candyCost = 2.5;

        int maxPizzaBuy = (moneyAmount / pizzaCost);
        int maxGumBuy =(moneyAmount - (pizzaCost * maxPizzaBuy)) / gumCost;
        int maxCanBuy = (int) (((moneyAmount - (pizzaCost * maxPizzaBuy)) - (gumCost * maxGumBuy)) / candyCost);
        int surrender = (int) (moneyAmount - (pizzaCost * maxPizzaBuy) - (gumCost * maxGumBuy) - (maxCanBuy * candyCost));

        System.out.println("На эти деньги мы можем купить:"
                + "\n- " + maxPizzaBuy + " Пиццы"
                + "\n- " + maxGumBuy + " Жвачки"
                + "\n- " + maxCanBuy + " Конфеты"
                + "\n- Сдача с магазина: " + surrender + " Рубля");
    }
}