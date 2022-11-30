import java.util.Scanner;

/**
 * Wabbit800
 */
public class Wabbit800 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            if (x1 == x2 || y1 == y2) {
                System.out.println(Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2)));
            } else {
                System.out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2) + 2);
            }
        }
    }
}
// was able to write the code in a short time
// but reading long essay for a problem seems intimidating
// though all the problems in the 800 category is very simple , yet i after
// going through few lines of the problem statement , i gave up and stopped ,
// and this always happens with me during the coding rounds of interviews.
// but i think this is change eventually as i do more problems on codeforces.
