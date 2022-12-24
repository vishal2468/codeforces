import java.util.Scanner;
public class FairNumber1000 {
    public static boolean helper(long num){
        long temp=num;
        while(temp!=0){
            long mod=temp%10;
            temp=temp/10;
            if(mod==0) continue;
            else if(num%mod!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(int i=0;i<n;i++){
            long num=sc.nextLong();
            while(helper(num)!=true){
                num++;
            }
            System.out.println(num);
        }
    }
}
// simple problem
// used brute force approach but need to realise that brute force will work..
// over all a nice solution
