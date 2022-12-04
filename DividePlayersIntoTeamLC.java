import java.util.HashMap;
public class DividePlayersIntoTeamLC {
    public long dividePlayers(int[] skill) {
        int len=skill.length;
        long chemistry=0;
        long sum=0;
        for(int i:skill){
            sum+=i;
        }
        if(sum%(len/2)!=0) return -1;
        int avgskill=(int)sum/(len/2);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            // System.out.println(map);
            if(map.containsKey(avgskill-skill[i])){
                chemistry+=(skill[i]*(avgskill-skill[i]));
                if(map.get(avgskill-skill[i])==1)
                    map.remove(avgskill-skill[i]);
                else
                    map.put(avgskill-skill[i],map.get(avgskill-skill[i])-1);
            }
            else{
                map.put(skill[i],map.getOrDefault(skill[i],0)+1);
            }
        }
        // System.out.println(chemistry);
        if(map.size()!=0) return -1;
        return chemistry;
    }
}

// took a lot of time to solve this problem
// was not able do it quickly becaue was not able to troublesoot the bug 
// i should have put skill[i] into the map but i put avgskill-skill[i] which made troubleshooting difficult
//  now i will never put the difference in the map.
