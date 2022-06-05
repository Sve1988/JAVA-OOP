package FootballTeamGenerator;

public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
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

    private void setEndurance(int endurance) {
        if (endurance >= 0 && endurance <= 100) {
            this.endurance = endurance;
        } else {
            String msg = String.format("Endurance should be between 0 and 100.");
            throw new IllegalArgumentException(msg);
        }
    }

    private void setSprint(int sprint) {
        if (sprint >= 0 && sprint <= 100) {
            this.sprint = sprint;
        } else {
            String msg = String.format("Sprint should be between 0 and 100.");
            throw new IllegalArgumentException(msg);
        }
    }

    private void setDribble(int dribble) {
        if (dribble >= 0 && dribble <= 100) {
            this.dribble = dribble;
        } else {
            String msg = String.format("Dribble should be between 0 and 100.");
            throw new IllegalArgumentException(msg);
        }
    }

    private void setPassing(int passing) {
        if (passing >= 0 && passing <= 100) {
            this.passing = passing;
        } else {
            String msg = String.format("Passing should be between 0 and 100.");
            throw new IllegalArgumentException(msg);
        }
    }

    private void setShooting(int shooting) {
        if (shooting >= 0 && shooting <= 100) {
            this.shooting = shooting;
        } else {
            String msg = String.format("Shooting should be between 0 and 100.");
            throw new IllegalArgumentException(msg);
        }
    }

    public double overallSkillLevel(){
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;
    }
}
