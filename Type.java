 //autoboxing unboxing
 class Tree {
    int a;
    int b;
    void sum(int a,int b){
         System.out.println(a+b);
    }
}
class Type{
    int a;
    int c;
    void sum(int a,int c){
        System.out.println(a+(long)c);
    }
    public static void main(String args[]){
        Type t = new Type();
        t.sum(10,245678);
    }
}