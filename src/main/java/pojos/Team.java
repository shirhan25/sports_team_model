package pojos;

import java.util.Arrays;
import java.util.Objects;

public class Team {
    // we can use any class as a datatype i.e manager as a property
    private Player[] players;
    private String name;
    private Manager manager;

    //default construcutor - allows us to make a player object
    public Team() {
    }


    // constructor - only putting two properties as parameters

    public Team (String name,Manager manager){
        this.name = name;
        this.manager = manager;
        this.players = new Player [15];
        // player will be constant so we initialise it in the constructor
    }

    //getter
    public Player[] getPlayers() {
        return players;
    }
    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }





    //setter
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }






    @Override
    public String toString() {
        return "Team{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Arrays.equals(players, team.players) && Objects.equals(name, team.name) && Objects.equals(manager, team.manager);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, manager);
        result = 31 * result + Arrays.hashCode(players);
        return result;
    }
}




