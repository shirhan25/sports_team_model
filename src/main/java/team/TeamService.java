package team;

import players.Player;

//business logic goes here - methods
public class TeamService {

//default constructor - you dont need it here

    public TeamService() {


    }
//count the empty spaces on the team
//return an int
// parameter: Team - information we can access within team

    public int countEmptySpacesOnTeam(Team team) {
        // create a placeholder variable to store the count, starts at 0
        int count = 0;

        //looking through player[] for nulls via loop and count null
        for (Player player : team.getPlayers()) {
            // getplayers gets the array for players
            //if statement, if it equals to null add 1 to the count. == compared the ref, checking for absence of something use ==
            if (player == null) {
// how to add one to the count
                count++;
// no else statement as we don't do anything if there's a player
            }

        }

        //return count
        return count;
    }


/*  Player [] player = team.getPlayers();
  for (int i = 0; i <players.length; i++) {
  if (players[i] == null){
  count++
  }
  }
  return count;

        }
 */

// adding player to team / no need to return & just need to do
// telling the compiler something could throw an exception
    public int addPlayerToTeam(Team team, Player player) throws Exception {
        //checking spaces on the team
        int spaces = countEmptySpacesOnTeam(team);
        //if there is, add the player
        if (spaces > 0) {
            // get players array from team,create a variable to store
            Player[] players = team.getPlayers();
            // add player to first avaliable empty space
            //loop through players array
            for (int i = 0; i < players.length; i++) {
                //if we find an empty space, add the player the beak

                if (players[i] == null) {
                    //adding the player
                    players[i] = player;
                    break;
                }
            }
        }
        //outside the if statement
        else {
            throw new Exception();
        }

        return spaces;
    }
}







