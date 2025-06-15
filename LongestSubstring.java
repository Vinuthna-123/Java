import java.util.HashSet;
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int start = 0, maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            while (seen.contains(s.charAt(end))) {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));

    
}
}

