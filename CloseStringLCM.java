import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CloseStringLCM {
    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
    }

    public static boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> w1 = new HashMap<>();
        Map<Character, Integer> w2 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            w1.put(c, w1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            w2.put(c, w2.getOrDefault(c, 0) + 1);
        }
        if (w2.keySet().stream().sorted().collect(Collectors.toList())
                .equals(w1.keySet().stream().sorted().collect(Collectors.toList()))
                && w2.values().stream().sorted().collect(Collectors.toList())
                        .equals(w1.values().stream().sorted().collect(Collectors.toList()))) {
            return true;
        }
        return false;
    }
}
