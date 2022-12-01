import java.util.Scanner;

public class King800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long size=sc.nextLong();
        long x=sc.nextLong();
        long y=sc.nextLong();
        long w=Math.max(Math.abs(x-1),Math.abs(y-1));
        long b=Math.max(Math.abs(x-size),Math.abs(y-size));
        if(w<=b) System.out.println("White");
        else System.out.println("Black");
    }
}
// took more than 15 mins to solve the problem
// got stuck twice , 1st to find the solution it was a bit tricky
// then with data type , should have used long instead of int and this problems will be really difficult to identify during contests .