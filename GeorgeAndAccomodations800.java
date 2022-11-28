import java.util.Scanner;
import java.util.concurrent.Callable;

public class GeorgeAndAccomodations800 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int living=scanner.nextInt();
            int capacity=scanner.nextInt();
            if(capacity-living>=2) ans++;
        }
        System.out.println(ans);
    }
}
