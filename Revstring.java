public class Revstring {
    public static String reverse(String input){
        StringBuilder s = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            s.append(input.charAt(i));
        }
        return s.toString();
    }
    public static void main(String args[]){
        String input = "hello";
        String res = reverse(input);
        System.out.println(res);
    }
}
