import java.util.Scanner;

public class PileOfCandies800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            System.out.println((a+b+c)/2);
        }
    }
}
