import java.util.Arrays;
import java.util.Scanner;

public class Barrel800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int barrels=sc.nextInt();
            int k=sc.nextInt();
            int ar[]=new int[barrels];
            for(int j=0;j<barrels;j++){
                ar[j]=sc.nextInt();
            }
            Arrays.sort(ar);
            long sum=0;
            for(int j=0;j<=k;j++){
                sum+=ar[barrels-1-j];
            }
            System.out.println(sum);
        }
    }
}

// not very good
// took more than 13 mins
// was not sure if the solution will work 
// although in my defence i did nor read the input conditions properly
//  ie k>=1 . and  barells will be greater then k. so the problem is simplified