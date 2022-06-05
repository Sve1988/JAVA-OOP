package foodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Buyer> buyers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String text = scanner.nextLine();
            String[] tokens = text.split("\\s+");
            if (tokens.length == 4){
                Buyer citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                buyers.add(citizen);
                citizen.buyFood();
            }
            else if (tokens.length == 3){
                Buyer rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                buyers.add(rebel);
                rebel.buyFood();
            }
        }
        String text = scanner.nextLine();
        int sum = 0;

        while (!text.equals("End")){

            for (Buyer buyer : buyers) {
                if (text.equals(buyer.getName())){
                    sum = sum + buyer.getFood();
                }
            }

            text = scanner.nextLine();
        }

        System.out.println(sum);
    }
}
