package team;

import manager.Manager;
import org.junit.jupiter.api.Test;
import players.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class TeamServiceTest {

    // annotation and flags to junit that everything underneath is a test.
   @Test
    public void canCountEmptySpacesOnTeamWhenEmpty(){
       //Given - creating team and manager object
       Manager manager = new Manager("test manager");
       Team team = new Team("team1" ,manager);
       TeamService underTest = new TeamService();
       //When - actual =invoking the method
      int actual= underTest.countEmptySpacesOnTeam(team);
       //Then
       int expected = 15;
       assertThat(actual).isEqualTo(expected);

   }

   @Test
    public void canCountEmptySpacesOnTeamWithOnePlayer(){
       //Given - creating team and manager object
       Manager manager = new Manager("test manager");
       Team team = new Team("team1" ,manager);
       Player player = new Player("test player" , "winger" , 11, 2);
       TeamService underTest = new TeamService();

       try {
           int actual= underTest.addPlayerToTeam(team,player);
       } catch (Exception e) {
           e.printStackTrace();
       }
       //When - actual =invoking the method
       int actual = underTest.countEmptySpacesOnTeam(team);

       //Then
       int expected = 14;
       assertThat(actual).isEqualTo(expected);
   }

}
