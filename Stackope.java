import java.util.Stack;
public class Stackope {
    private Stack<pair> stack;

    private class pair{
        int val;
        int min;

        pair(int val,int min){
            this.val=val;
            this.min=min;
        }
    }
    public Stackope(){
        stack = new Stack<>();

    }
    public void push(int x){
        int min = stack.isEmpty() ? x : Math.min(x,stack.peek().min);
        stack.push(new pair(x,min));
    }
    public void pop(){
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    public int getMin(){
        if(!stack.isEmpty()){
            return stack.peek().min;
        }
        throw new IllegalStateException("Stack is empty");
    }
    public static void main(String args[]){
        Stackope min = new Stackope();
        min.push(10);
        min.push(20);
        min.push(7);
        System.out.println("Minimum: "+min.getMin());
        min.pop();
        System.out.println("Minimum: "+min.getMin());
        min.pop();
        System.out.println("minimum:"+min.getMin());   
    }

}
