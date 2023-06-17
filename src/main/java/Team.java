import java.util.ArrayList;
import java.util.List;

public class Team {

    private int teamSize;
    private List<String> memberList;
    //private List<Member> memberList;

    public Team(int teamSize) {
        this.teamSize = teamSize;
        memberList = new ArrayList<>();
    }

    public void addMember(String member){
        if(memberList.size()== teamSize){
            throw new IllegalArgumentException("풀팟");
        }
        memberList.add(member);
    }
    public int getMemberSize(){
        return memberList.size();
    }

    @Override
    public String toString() {
        return "Team"  + memberList;
    }
}
