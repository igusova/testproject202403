import java.util.Scanner;

public class VendingPool {
    public static void main(String[] args) {

        System.out.println("Введите количество денег:");
        int moneySum = new Scanner(System.in).nextInt();

        int[] prices = {89, 85, 129, 789};
        String[] products = {"Сникерс", "Баунти", "Кола"};

        boolean canBuy = false;

        int length = Math.min(prices.length, products.length);
        for(int i = 0; i < length; i++) {
            if (moneySum >= prices[i]) {
                System.out.println(products[i] + " - доступно для покупки");
                canBuy = true;
            }
        }

        checkNoMoney(canBuy);
    }

    public static void checkNoMoney(boolean canBuy) {
        if (!canBuy) {
            System.out.println("Внесите ещё денег, пока ни на что не хватает");
        }
    }
}