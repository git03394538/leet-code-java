import java.util.HashMap;
import java.util.Map;

/**
 * Sliding Window
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> cm = new HashMap<>();
        int ans = 0;

        for (int i = 0, j = 0; j < s.length(); j++){
            if(cm.containsKey(s.charAt(j))) {
                i = Math.max(i, cm.get(s.charAt(j)) + 1);
            }
            ans = Math.max(ans, j - i + 1);
            cm.put(s.charAt(j), j);
        }
        return ans;
    }

    public static void main(String args[]) {
        String input = "aabcdeaabcdefg";
        LengthOfLongestSubstring c = new LengthOfLongestSubstring();
        System.out.print(c.lengthOfLongestSubstring(input));
    }
}
