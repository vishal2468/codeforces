import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public static String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        PriorityQueue<Character> pq=new PriorityQueue<>((c1,c2)->map.get(c2)-map.get(c1));
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: map.keySet()){
            pq.add(c);
        }
        char ans[]=new char[s.length()];
        int pos=0;
        while(!pq.isEmpty()){
            char c=pq.remove();
            int f=map.get(c);
            for(int i=0;i<f;i++){
                ans[pos]=c;
                pos++;
            }
        }
        return String.valueOf(ans);
    }
    public static void main(String[] args) {
        frequencySort("tree");
    }
}