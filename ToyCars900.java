import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToyCars900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean toppled = false;
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                if (temp == 1 || temp == 3) {
                    toppled = true;
                }
            }
            if (toppled == false) {
                count++;
                list.add(i + 1);
            }
        }
        System.out.println(count);
        for (int i : list)
            System.out.print(i + " ");
    }
}
// took 17 minutes to solve
// encountered an intresting problem.
// i was breaking the loop early and therefor was not reading the whole input
// and there wore wasa getting the wrong solution