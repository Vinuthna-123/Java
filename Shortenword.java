import java.util.Scanner;
public class Shortenword {
    public static String Shorten(String word){
        int len = word.length();
        if(len<=2){
            return word;
        }
        int midcount = len -2;
        // String midpart = word.substring(1,len-1).replace(" ",""); // which helps to remove space...
        // int midcount = midpart.length();
        String shortenword = word.charAt(0) + String.valueOf(midcount) + word.charAt(len-1);
        return shortenword;

    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word to shorten it:");
        String word = in.nextLine();
        String Shortenword = Shorten(word);
        System.out.println("The shorten word of the string is:"+Shortenword);
        in.close();

    }
}
