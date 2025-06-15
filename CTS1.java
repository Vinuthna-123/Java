public class CTS1 {
    public static int efficientDish(int n , int[] likVal){
      int tot =0;
      for(int i=0;i<n;i++){
        int time = i+1;
        int likvalues = likVal[i];
        int coefficient = time * likvalues;
            tot +=coefficient;
    }
      return tot;
      
    }
    public static void main(String args[]){
        int n = 3;
        int arr[] = {-1,3,4};
        int res = efficientDish(n, arr);
        System.out.println(res);
        
    }
    
}






// 1)Monica has cooked N dishes and collected the data on the level of satisfaction for all the
// dishes from a guest. The guest return an array, where the " element of the array is the liking level of the l" dish. Also, the time taken to cook the i dish is i. Ly
// Like-to-time coefficient of a dish is calculated by multiplying the time taken to cook food with Its liking level, I.e., I'input2(i). Total Like-to-time coefficient is calculated by summing up all Individual coefficients of dishes.
// You want the total Like-to-time coefficient to be maximum. You can also remove some dishes, in which case, a new coefficient is calculated using the left dishes.
// Find the maximum sum of all possible Like-to-time coefficients,
// Input Specification:
// input1: N, number of dishes
// input2: Array representing the linking value of each dish
// Output Specification:
// Return maximum like-to-time coefficient possible
// Example 1: input1: 3
// inputz: {-1,3,4}

// OUTPUT:17
