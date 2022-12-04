import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class MinScoreCitiesLC {
    /**
     * 2492. Minimum Score of a Path Between Two Cities
     * Graph problem
     */
    Set<Integer> visited=new HashSet<>();
    public void dfs(HashMap<Integer,HashSet<Integer>> map,int node){
        for(int i:map.get(node)){
            if(!visited.contains(i)){
                // System.out.println(i);
                visited.add(i);
                dfs(map,i);
            }
        }
    }
    public int minScore(int n, int[][] roads) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        // make the graph.
        for(int i=0;i<roads.length;i++){
            if(!map.containsKey(roads[i][0])){
                map.put(roads[i][0],new HashSet<>());
            }
            if(!map.containsKey(roads[i][1])){
                map.put(roads[i][1],new HashSet<>());
            }
            map.get(roads[i][0]).add(roads[i][1]);
            map.get(roads[i][1]).add(roads[i][0]);
        }
        // System.out.println(map);
        visited.add(1);
        dfs(map,1);
        int ans=Integer.MAX_VALUE;
        for(int temp[]:roads){
            if(visited.contains(temp[0])){
                ans=Math.min(temp[2],ans);
            }
        }
        return ans;
    }
}
//  was not able to solve the problem within the given time
//  although was able to solve it later without any hints or help
//  it is not very difficult problem 
//  I need to practice more of graph problems.