package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(String name){
        int index = -1;

        for (int i = 0; i < players.size(); i++) {
            if (name.equals(players.get(i).getName())){
                index = i;
            }
        }

        if (index != -1){
            players.remove(index);
        }
        else {
            String msg = String.format("Player %s is not in %s team.", name, this.name);
            throw new IllegalArgumentException(msg);
        }
    }

    public double getRating(){
        double sum = 0;
        for (int i = 0; i < players.size(); i++) {
            sum = sum + players.get(i).overallSkillLevel();
        }
        if (!players.isEmpty()) {
            return sum / players.size();
        }
        else {
            return 0;
        }
    }
}
