import java.util.Stack;
import java.util.Map;

public class ValidParenthises {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // Define mapping for closing brackets to opening brackets
        Map<Character, Character> matching = Map.of(')', '(', '}', '{', ']', '[');
        
        for (char ch : s.toCharArray()) {
            if (matching.containsKey(ch)) { 
                char top = stack.isEmpty() ? '#' : stack.pop(); 
                if (top != matching.get(ch)) {
                    return false;
                }
            } else { 
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthises vp = new ValidParenthises();
        System.out.println(vp.isValid("()"));       
        System.out.println(vp.isValid("()[]{}"));   
        System.out.println(vp.isValid("(]"));      
        System.out.println(vp.isValid("([)]"));     
        System.out.println(vp.isValid("{[]}")); 
        System.out.println(vp.isValid("({[]})"));    
    }
}
