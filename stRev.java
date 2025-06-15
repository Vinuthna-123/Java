import java.util.*;
public class stRev {
    public static String Reverse(String str) {
        char[] charArray=str.toCharArray();
        int start=0;
        int end=charArray.length-1;
        while(start<end){
            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;

        }
        return new String(charArray);



    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str=new String();
        str=in.nextLine();
        System.out.println("original String:"+str);
        String res=Reverse(str);
        System.out.println("Reversed String is:"+res);
        in.close();
    }
    
}
