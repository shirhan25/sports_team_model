import manager.Manager;
import players.Player;
import team.Team;
import team.TeamService;

public class Main {

    public static void main(String[] args) {

        Player player = new Player (" Fin Rusell" , "Fly" , 10, 10 );

// creating a manager object
    Manager manager = new Manager( "Steve");
 // creating a team object with properties like name and manager
        Team team = new Team("Scotland", manager);
        //creating the team service object
    TeamService teamService = new TeamService();

//counting empty spaces on the team
        int spaceBefore = teamService.countEmptySpacesOnTeam(team);
        System.out.println(spaceBefore);
        //try this - adding player to a team
        try {
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            teamService.addPlayerToTeam(team,player);
            
           // catch it when its full and throw an exception
        } catch (Exception e)  {
            System.out.println("team is full");
        }


        //checking spaces you have left adding a player
        int spacesAfter = teamService.countEmptySpacesOnTeam(team);
        System.out.println(spacesAfter);
    }

}
