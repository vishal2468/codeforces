import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparingInt900 {
    public static String removeZeros(String s) {
        int zeros = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0')
                break;
            zeros++;
        }
        return s.substring(zeros);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String int1 = br.readLine();
        String int2 = br.readLine();
        int len1 = int1.length();
        int len2 = int2.length();
        int2 = removeZeros(int2);
        int1 = removeZeros(int1);
        if (int1.length() < int2.length())
            System.out.println("<");
        else if (int1.length() > int2.length())
            System.out.println(">");
        else {
            for (int i = 0; i < int1.length(); i++) {
                if (int1.charAt(i) < int2.charAt(i)) {
                    System.out.println("<");
                    return;
                } else if (int1.charAt(i) > int2.charAt(i)) {
                    System.out.println(">");
                    return;
                }
            }
            System.out.println("=");
        }
    }
}

// took 15 mins
// problem was a bit long ans also the input was required to be taken by bffered reader
