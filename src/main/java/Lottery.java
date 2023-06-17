import java.util.Arrays;
import java.util.List;

public class Lottery {

    public static String getRandomMember(List<String> memberList){
        if(memberList.isEmpty()){
            return null;
        } else {
            int index = (int)(Math.random() * memberList.size());
            String name = memberList.get(index);
            memberList.remove(index);
            return name;
        }
    }

    public static void addFixMember(List<Team> teamList, String[] fixMember){
        int index = (int)(Math.random() * teamList.size());

        while(true){
            if(teamList.get(index).getMemberSize()!=0){
                index = (int)(Math.random() * teamList.size());
            } else {
                break;
            }
        }

        for (String member : fixMember) {
            teamList.get(index).addMember(member);
        }
    }

    public static int[] divideTeamSize(int totalMemberSize, int teamSize){
        int[] divideTeam;
        if(totalMemberSize%teamSize==0){
            divideTeam = new int[totalMemberSize/teamSize];
            Arrays.fill(divideTeam, teamSize);
        } else {
            divideTeam = new int[totalMemberSize/teamSize+1];
            for (int i = 0; i < divideTeam.length-1; i++) {
                divideTeam[i] = teamSize;
            }
            divideTeam[divideTeam.length-1] = totalMemberSize%teamSize;
        }
        return divideTeam;
    }

    public static int[] divideTeamSize(int totalMemberSize, int teamSize, int distribution){
        return null;
    }
}
