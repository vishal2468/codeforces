import java.util.Scanner;

public class PowerConsumption900 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        int p3=sc.nextInt();
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        int ar[][]=new int[n][2];
        for(int i=0;i<n;i++){
            ar[i][0]=sc.nextInt();
            ar[i][1]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(ar[i][1]-ar[i][0])*p1;
            if(i!=n-1){
                if(ar[i+1][0]-ar[i][1]>(t2+t1)){
                    ans+=((ar[i+1][0]-ar[i][1])-(t2+t1))*p3;
                    ans+=(t2)*p2;
                    ans+=(t1)*p1;
                }
                else if(ar[i+1][0]-ar[i][1]>t1){
                    ans+=((ar[i+1][0]-ar[i][1])-t1)*p2;
                    ans+=(t1)*p1;
                }
                else{
                    ans+=(ar[i+1][0]-ar[i][1])*p1;
                }
            }
        }
        System.out.println(ans);
    }
}
