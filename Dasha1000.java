// https://codeforces.com/problemset/problem/761/A

import java.util.Scanner;

public class Dasha1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = sc.nextInt();
        int odd=sc.nextInt();
        if(even==odd&&even==0){
            System.out.println("NO");
            return;
        }
        if(Math.abs(even-odd)>1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
