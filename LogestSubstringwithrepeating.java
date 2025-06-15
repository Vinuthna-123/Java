import java.util.HashMap;
public class LogestSubstringwithrepeating {
    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int maxLength = 0, maxFreq = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            freqMap.put(endChar, freqMap.getOrDefault(endChar, 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(endChar));

            while ((end - start + 1) - maxFreq > k) {
                char startChar = s.charAt(start);
                freqMap.put(startChar, freqMap.get(startChar) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println("Longest substring length: " + characterReplacement(s, k)); 
    }
}
