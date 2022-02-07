import manager.Manager;
import players.Player;
import team.Team;
import team.TeamService;

public class Main {

    public static void main(String[] args) {

        Player player = new Player (" Fin Rusell" , "Fly" , 10, 10 );


    Manager manager = new Manager( "Steve");
        Team team = new Team("Scotland", manager);
    TeamService teamService = new TeamService();
            //creating the team service object

        int space = teamService.countEmptySpacesOnTeam(team);
        System.out.println(space);
    }

}
