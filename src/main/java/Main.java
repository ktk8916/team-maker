import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] fix1 = {"이동명", "김태경"};
        String[] fix2 = {"왕경훈", "이도경"};

        String[] memberArray = {
                "김수동", "김정수", "김지혜", "김태홍", "박경희",
                "박준제", "안재원", "양기석", "이세인", "이재명",
                "이태열", "이태웅", "정민균", "정준기", "채오성",
                "최영준", "최웅진", "허하나", "현수정"};

        List<String> memberList = new ArrayList<>(Arrays.asList(memberArray));

        int[] divideTeamSize = Lottery.divideTeamSize(23, 4);

        List<Team> teamList = new ArrayList<>();

        for (int size : divideTeamSize) {
            teamList.add(new Team(size));
        }

        Lottery.addFixMember(teamList, fix1);
        Lottery.addFixMember(teamList, fix2);

        for (Team team : teamList) {
            while (true) {
                String member = Lottery.getRandomMember(memberList);
                try{
                    team.addMember(member);
                } catch (Exception e){
                    memberList.add(member);
                    break;
                }
            }
            System.out.println(team);
        }
    }
}
