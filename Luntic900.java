import java.util.Scanner;

public class Luntic900 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int zero=0;
            int one=0;
            for(int j=0;j<n;j++){
                int temp=sc.nextInt();
                if(temp==0) zero++;
                if(temp==1) one++;
            }
            System.out.println((long)(Math.pow(2, zero)*one));
        }
    }
}
// it took some time to come up with the solution 
// i was thinking to solve this problem using dp
// coding the solution did not take any time.
