import java.util.Scanner;

public class RoofConstruction1000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            for(int j=0;j<k/2;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
