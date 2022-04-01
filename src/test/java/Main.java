import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        team.setName("\"John Doe\"");
        team.setPosition("Manual Tester");;
        System.out.println(team.getName());
        //System.out.println(team.getPosition());
        System.out.println(team.getMembers());

        PositionChanges promote = new PositionChanges();
        team.setPosition("\"Developer\"");
        System.out.println(team.getPosition());

    }
}
