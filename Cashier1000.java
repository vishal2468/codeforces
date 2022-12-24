import java.util.Scanner;

public class Cashier1000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// number of regular customers
        int l=sc.nextInt(); // work hour length (in mins)
        int a=sc.nextInt(); // break duration
        int arrival[]=new int[n];
        int servicing[]=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            arrival[i]=sc.nextInt();
            servicing[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            ans+=((arrival[i+1]-(arrival[i]+servicing[i]))/a);
        }
        if(n==0){
            ans+=l/a;
        }
        else {
            ans+=(arrival[0])/a;
            ans+= (l-(arrival[n-1]+servicing[n-1]))/a;
        }
        System.out.println(ans);
    }
}
// it was a difficult problem in my regard
// edge cases to handle and also i did a silly mistake of using % instead of devide
// poor performance