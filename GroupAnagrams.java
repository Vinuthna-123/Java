import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        
        for (String word : strs) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);  // Sort the characters of the word
            String sortedWord = new String(wordArray);
            
            anagrams.putIfAbsent(sortedWord, new ArrayList<>());  // If not present, add a new list
            anagrams.get(sortedWord).add(word);  // Add the word to the corresponding anagram group
        }
        
        return new ArrayList<>(anagrams.values());  // Return the values (anagram groups)
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Grouped Anagrams: " + groupAnagrams(strs));
        // Output: [[eat, tea, ate], [tan, nat], [bat]]
    }
}
