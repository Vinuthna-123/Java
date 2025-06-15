import java.util.Scanner;
public class Palindrome {
    int start;
    int end;
    
    void palindrome(String str) {
        start = 0;
        end = str.length() - 1;
        int flag = 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                flag = 0;
                break;
            }
            start++;
            end--;
        }
        
        if (flag == 1) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
    
    public static void main(String args[]) {
        Palindrome pal = new Palindrome();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = in.nextLine();
        in.close();
        pal.palindrome(a);
    }
}
