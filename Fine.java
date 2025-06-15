 class Final {
    final void salary(int oneday_salary , int no_of_workingdays){
          int res = oneday_salary*no_of_workingdays;
          System.out.println(res);
    }
    
}
class Fine extends Final{
   // void salary(int oneday_salary , int no_of_workingdays) // cant override the final method.
   void salary(int salary){
    System.out.println(salary);
   }
   public static void main(String args[]){
    Fine f = new Fine();
    f.salary(3000);
    f.salary(1500, 20);
   }
}
