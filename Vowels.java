public class Vowels {
        public static int countVowels(String str) {
            str = str.toLowerCase();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            return count;
        }
    
        public static void main(String[] args) {
            String input = "Hello, world!";
            int vowelCount = countVowels(input);
            System.out.println("Number of vowels in the string: " + vowelCount);
        }
    }
