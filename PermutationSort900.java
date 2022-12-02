import java.util.Scanner;

public class PermutationSort900 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int ans=0;
            int n =sc.nextInt();
            int ar[]=new int[n];
            for(int j=0;j<n;j++)
                ar[j]=sc.nextInt();
            if(ar[0]==n&&ar[n-1]==1)
                ans=3;
            else if(ar[0]!=1&&ar[n-1]!=n)
                ans=2;
            else{
                int flag=0;
                for(int k=0;k<n;k++){
                    if(ar[k]!=k+1){
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                    ans=0;
                else
                    ans=1;
            }
            System.out.println(ans);
        }
    }
}
// took more than 15 mins
//  was able to solve the problem without seeing the failed test case.
// missed 1 case