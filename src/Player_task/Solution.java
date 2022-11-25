package Player_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Player> player = new ArrayList<>();
        System.out.println("Enter the number you want");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the playerId.");
            int playerId = sc.nextInt();
            System.out.println("Enter the skill");
            String skill = sc.next();
            System.out.println("Enter the level");
            String level = sc.next();
            System.out.println("Enter the points");
            int points = sc.nextInt();
            player.add(new Player(playerId, skill, level, points));
        }
        String skill1 = sc.next();
        String level1 = sc.next();
        int output1 = findPointsForGivenSkill(player, skill1);
        if (output1 == 0)
            System.out.println("The given Skill is not available");
        else
            System.out.println(output1);
        Player output2 = getPlayerBasedOnLevel(player, skill1, level1);
        if (output2 == null)
            System.out.println("No player is available with specified level, skill and eligibility points");
        else
            System.out.println(output2.getPlayerId());
    }
    public static int findPointsForGivenSkill(List<Player> player, String skill) {
        int sum = 0;
        if (player!=null){
        for (Player players :player) {
            if (players.getSkill().equals(skill)) {
                sum += players.getPoints();
            }
        }}
            return sum;
    }
    public static Player getPlayerBasedOnLevel(List<Player> player, String skill, String level) {
        Player player1 = null;
        if (player!=null){
        for (Player players : player) {
            if (players.getSkill().equals(skill) && players.getLevel().equals(level) && players.getPoints() >= 20) {
                player1 = players;
                break;
            }
        }}
        return player1;
    }

}
