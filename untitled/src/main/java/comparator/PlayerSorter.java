package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerSorter {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player playera = new Player(59, "John", 20);
        Player playerb = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 18);
        footballTeam.add(playera);
        footballTeam.add(playerb);
        footballTeam.add(player3);

      // System.out.println("Before Sorting : " + footballTeam);
        //Collections.sort(footballTeam);
        //System.out.println("After Sorting : " + footballTeam);



        System.out.println("Before Sorting : " + footballTeam);
        PlayerRankingComparator playerComparator = new PlayerRankingComparator();
        Collections.sort(footballTeam,playerComparator);
        System.out.println("After Sorting : " + footballTeam);

        Collections.sort(footballTeam,new PlayerRankingComparator());

        System.out.println("Before Sorting : " + footballTeam);
        PlayerAgeComparator playerComparator2 = new PlayerAgeComparator();
        Collections.sort(footballTeam, playerComparator2);
        System.out.println("After Sorting : " + footballTeam);


        //using lambdas
        Comparator<Player> byRanking = Comparator
                .comparing(Player::getRanking);
        Comparator<Player> byAge = Comparator
                .comparing(Player::getAge);


        System.out.println(byAge.toString());


    }

}
