public class String1 {
    public static void main(String args[]){
        String s1 = "Hello";
        String s2=new String("Hello");
       if(s1.equals(s2)){
        System.out.println("Equal");//output is equal because it will check only values if we give .equal
       }
       else{
        System.out.println("Not Equal");

       }
    if(s1==s2){
        System.out.println("Equal");//output is not equal because it will check an reference here. manam s2 kii new ani use chesi object create chesam so same string yee but malli create avuthadhi.bec we used new there.so reference will be different.
       }
       else{
        System.out.println("Not Equal");

       }
        System.out.println(s1);
        System.out.println(s2);
        char ch[]={'g','o','o','d'};
        char ch1[]={'g','o','o','d'};
        if(ch==ch1){
            System.out.println("true");//char kii false avuthadhi . okkoka char check cheyali . if u have time try to do by using loops. to compare an ch and ch1.
        }
        else{
            System.out.println("false"); 
        }
        // for(int i=0;i<ch.length;i++){
        //     for(int j=0;j<ch1.length;j++){
        //         if(ch[i] == ch1[j]){
        //             System.out.println("true");
        //             break;
        //         }
        //         else{
        //                  System.out.println("false");
                         
        //              }
        //     }
        // }
        if(ch.equals(ch1)){
            System.out.println("true");
        }
        else{
            System.out.println("false"); 
        }
        // String str1 = new String(ch1);
        // System.out.println(str1);  
        // String str = new String(ch);
        // System.out.println(str);  
    }
    
}
//convert string to char and chat=r to string.
// concat,tocompare,trim,join,indexof.
// class Example{
//     public static void main(String args[]){
//     String[] words = {"Hello", "world", "Java"};
//     String joinedString = String.join(" ",words);
//     System.out.println(joinedString); // Output: "Hello world Java"
//     }
//     }