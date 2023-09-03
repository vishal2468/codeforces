import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polycarp1000 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        list.sort((i,j)->i-j);
        // System.out.println(list);
        int curr=0;
        for(int i=0;i<n;i++){
            if(list.get(i)>=curr+1){
                curr++;
            }
        }
        System.out.println(curr);
    }
}
