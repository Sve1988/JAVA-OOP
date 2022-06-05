package birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<Birthable> members = new ArrayList<>();

        while(!text.equals("End")){
            String[] token = text.split("\\s+");
            if (token[0].equals("Citizen")){
                Birthable citizen = new Citizen(token[1], Integer.parseInt(token[2]), token[3], token[4]);
                members.add(citizen);
            }
            else if (token[0].equals("Robot")){
                Robot robot = new Robot(token[1], token[2]);
            }
            else if (token[0].equals("Pet")){
                Birthable pet = new Pet(token[1], token[2]);
                members.add(pet);
            }

            text = scanner.nextLine();
        }

        String year = scanner.nextLine();

        boolean flag = false;

        for (Birthable member : members) {
            if (member.getBirthDate().endsWith(year)){
                System.out.println(member.getBirthDate());
                flag = true;
            }
        }

        if (!flag){
            System.out.println("<no output>");
        }
    }
}
