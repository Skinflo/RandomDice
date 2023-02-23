import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public void menu() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("Введите число кубов от 1 до 20 => ");
            int numberDice = scanner.nextInt();
            System.out.print("Введите число граней на кубах от 1 до 20 => ");
            int diceSide = scanner.nextInt();

            if (numberDice > 0 && numberDice < 21 && diceSide > 0 && diceSide < 21) {
                ArrayList<Object> dice = new ArrayList<>();
                for (int i = 1; i <= numberDice; i++) {
                    int number = random.nextInt(1, diceSide);
                    dice.add(number);
                }
                System.out.println("Кидаем " + numberDice + "D" + diceSide);
                System.out.println(dice);
            } else if (numberDice < 0 || numberDice > 20) {
                System.out.println("Неверно выбрано число кубов");
            } else if (diceSide < 0 || diceSide > 20) {
                System.out.println("Неверно выбрано число граней");
            }
        }
    }
}

