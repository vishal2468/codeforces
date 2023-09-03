// https://codeforces.com/problemset/problem/1829/D
// submitted
import java.util.Scanner;

public class GoldRush1000 {
    public static boolean isPossible(int n , int m){
        if(m>n) return false;
        if(m==n) return true;
        if(n%3!=0) return false;
        return isPossible(n/3, m)||isPossible((n/3)*2, m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(isPossible(n,m)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
