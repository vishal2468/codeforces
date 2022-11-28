import java.util.Scanner;

public class GrassFiled800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(a+b+c+d==0) System.out.println(0);
            else if(a+b+c+d>=1&&a+b+c+d<4) System.out.println(1);
            else System.out.println(2);
        }
    }
}

// read the problem and coded the solution within 5 mins 30 secs