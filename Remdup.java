import java.util.LinkedHashSet;
import java.util.Set;
public class Remdup {
    public static String Remdupli(String input){
        Set<Character> charSet = new LinkedHashSet<>();
        StringBuilder s = new StringBuilder();
        for(char c : input.toCharArray()){
            if(charSet.add(c)){
                s.append(c);

            }
        }
        return s.toString();
    }
    public static void main(String args[]){
        String input = "abcdac";
        String result = Remdupli(input);
        System.out.println("The original String is: "+input);
        System.out.println("The String after removing the Duplicates:  "+result);
    }
}
