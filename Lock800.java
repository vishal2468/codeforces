import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lock800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String l1=sc.next();
        String l2=sc.next();
        String l3=sc.next();
        if(l1.charAt(0)==l3.charAt(2)&&l1.charAt(2)==l3.charAt(0)&&l1.charAt(1)==l3.charAt(1)&&l2.charAt(0)==l2.charAt(2))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}

//  was unable to take input from the user initially as i did not realize that there are only 3 list of input
// after that the problem was solved in 5 mins