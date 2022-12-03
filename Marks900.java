import java.util.Scanner;

public class Marks900 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int max[]=new int[m];
        int marks[][]=new int[n][m];
        for(int i=0;i<n;i++){
            String temp=sc.next();
            for(int j=0;j<m;j++){
                marks[i][j]=temp.charAt(j)-'0';
                max[j]=Math.max(marks[i][j],max[j]);
                // System.out.print(marks[i][j]);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(marks[i][j]==max[j]){
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
//  solved within 15 mins 
// took this long beacuse used the wrong condition in the logic
// then i removed the prontln ststement by mistake
// over all good