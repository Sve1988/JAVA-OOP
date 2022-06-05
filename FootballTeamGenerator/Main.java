package FootballTeamGenerator;

import java.lang.management.PlatformLoggingMXBean;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Team> teams = new HashMap<>();


        while (!input.equals("END")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String teamName = tokens[1];

            if (command.equals("Team")) {
                try {
                    teams.putIfAbsent(teamName, new Team(teamName));
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }

            } else if (command.equals("Add")) {
                if (!teams.containsKey(teamName)) {
                    String msg = String.format("Team " + teamName + " does not exist.");
                    throw new IllegalArgumentException(msg);

                }

                String name = tokens[2];
                int endurance = Integer.parseInt(tokens[3]);
                int sprint = Integer.parseInt(tokens[4]);
                int dribble = Integer.parseInt(tokens[5]);
                int passing = Integer.parseInt(tokens[6]);
                int shooting = Integer.parseInt(tokens[7]);
                try {
                    Player player = new Player(name, endurance, sprint, dribble, passing, shooting);
                    teams.get(teamName).addPlayer(player);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }

            } else if (command.equals("Remove")) {
                if (!teams.containsKey(teamName)) {
                    throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                }
                try {
                    teams.get(teamName).removePlayer(tokens[2]);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            } else if (command.equals("Rating")){
                if (!teams.containsKey(teamName)) {
                    throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                }
                System.out.printf("%s - %.0f", teamName, teams.get(teamName).getRating());
            }

            input = scanner.nextLine();
        }
    }
}
