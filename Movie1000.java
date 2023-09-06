// https://codeforces.com/problemset/problem/499/A

import java.util.Scanner;

public class Movie1000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int currpos = 1 ;
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            while(currpos <=left)
                currpos = currpos+x;
            currpos = currpos-x;
            ans+=(right+1-currpos);
            currpos=right+1;

        }
        System.out.println(ans);
    }
}
