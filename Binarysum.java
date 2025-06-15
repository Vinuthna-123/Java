import java.util.Scanner;
  class Binarysum {
    public static void main(String args[]){
        // Binarysum b = new Binarysum();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        String input = in.nextLine();
        int sum=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)== '1'){
                sum++;    
            }
        }
        System.out.println("The sum of binary digits are:"+sum);
        in.close();
    }
    
}
