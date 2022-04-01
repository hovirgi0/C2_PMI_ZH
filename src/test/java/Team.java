import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Team {

        protected ArrayList<Team> teamList = new ArrayList<>();
        private static String name;
        private static String position;

    public Team(String name, String position) { }

    public Team() { }

    public void newMember() {
            String name = "";
            String position = "";
            for (Team team : teamList) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("name: ");
                String setName = scanner.nextLine();

                System.out.println("position: ");
                String setPosition = scanner.nextLine();
            }
        }

        public void leaveTeam() {
            String removedStr = String.valueOf(teamList.remove(1));

            String name = "";
            String position = "";
            for (Team team : teamList) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("name: ");
                String setName = scanner.nextLine();
                removedStr = String.valueOf(teamList.remove(setName));
            }
        }

        public String getMembers () {
            String teams = "";
            StringBuilder builder = new StringBuilder();
            for (Team team : teamList) { //konkatenálás
                teams += team.getName() + " " + team.getPosition() + "\r\n";
                builder.append(team.getName()).append(" ").append(team.getPosition()).append("\r\n");
            }
            return builder.toString();
        }

        public void setName(String Name) {
            this.name = Name;
        }

        public static String getName() {
            return name;
        }

        public void setPosition(String Position) {
            this.position = Position;
        }

        public static String getPosition() {
            return position;
        }

    }

    class PositionChanges extends Team{
        public void promote(String name, String position){
            boolean contains = false; // if-hez kell
            for(int i = 0; i<super.teamList.size(); i++) {
                if (super.teamList.get(i).getPosition().equals(position)) {
                    contains = true;
                }
            }
            if(!contains){
                super.teamList.add(new Team(name, position));
            }
            super.teamList.add(new Team(name, position));

            Scanner scanner = new Scanner(System.in);
            System.out.println("position: ");
            String setPositon = scanner.nextLine();
        }
    }
