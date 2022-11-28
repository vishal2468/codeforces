import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddOddOrSubEven800 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if(a==b) list.add(0);
            else if(a<b) {
                if((b-a)%2==1) list.add(1);
                else list.add(2);
            }
            else{
                if((a-b)%2==0) list.add(1);
                else list.add(2);
            }
        }
        for(int i:list) System.out.println(i);
    }
}
