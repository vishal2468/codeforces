import java.util.Scanner;

public class MakeATriangle800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int max=Math.max(s1,Math.max(s2,s3));
        int rest=s1+s2+s3-max;
        if(max>=rest){
            System.out.println(max+1-rest);
        }
        else
        System.out.println(0);
    }
}

// good persormance 6 mins