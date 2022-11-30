import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * TanyaAndStairways
 */
public class TanyaAndStairways {

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> staircount=new ArrayList<>();
        int currentcount=0;
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp<=currentcount){
                staircount.add(currentcount);
            }
            currentcount=temp;
        }
        staircount.add(currentcount);
        System.out.println(staircount.size());
        for(int i =0;i<staircount.size();i++){
            System.out.print(staircount.get(i)+" ");
        }
    }
}
// took more than 25 mins to solve the problem very poor performance