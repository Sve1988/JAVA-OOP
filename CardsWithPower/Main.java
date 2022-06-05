package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String power = scanner.nextLine();
        String suit = scanner.nextLine();

        System.out.printf("Card name: %s of %s; Card power: %d", CardPower.valueOf(power), SuitPower.valueOf(suit), CardPower.valueOf(power).getPower()+ SuitPower.valueOf(suit).getPowers());
    }
}
