import java.util.Arrays;
import java.util.Scanner;

public class USBFlash8000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int file=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        int sum=0;
        int i=ar.length-1;
        int count=0;
        while(sum<file&&i>=0){
            sum+=ar[i];
            i--;
            count++;
        }
        System.out.println(count);
    }
}
// took 9 mins to solve including reading
// should have taken 5 but i forgot to read input from the user and it took a long time to find that out
