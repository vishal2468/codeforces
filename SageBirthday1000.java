import java.util.Arrays;
import java.util.Scanner;

public class SageBirthday1000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println((ar.length-1)/2);
        for(int i=0;i<ar.length/2;i++){
            System.out.print(ar[ar.length-1-i]+" ");
            System.out.print(ar[i]+" ");
        }
        if(ar.length%2==1) System.out.print(ar[ar.length/2]);
    }
}
// 6
// 1 2 3 4 5 6
