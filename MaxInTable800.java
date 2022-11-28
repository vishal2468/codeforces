import java.util.Scanner;

public class MaxInTable800 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size=scanner.nextInt();
        int ar[][]=new int[size][size];
        int max=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==0||j==0){
                    ar[i][j]=1;
                }
                else{
                    ar[i][j]=ar[i-1][j]+ar[i][j-1];
                }
                max=Math.max(ar[i][j],max);
            }
        }
        System.out.println(max);
    }
}
