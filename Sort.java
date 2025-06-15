// interview imp question
// import java.io.*;
 
class Sort {
 
    // Sort the input array, the array is assumed to
    // have values in {0, 1, 2}
    static void printArray(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
    //     System.out.println("");
    }
    public static void main(String[] args)
    {
        int arr[] = { 0, 2, 1, 0, 1, 2, 1, 2, 1, 0, 0, 2 };
        int arr_size = arr.length;
        // 
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (arr[mid]) {
                // If the element is 0
            case 0: {
                temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                lo++;
                mid++;
                break;
            }
                // If the element is 1
            case 1:
                mid++;
                break;
                // If the element is 2
            case 2: {
                temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
                break;
            }
            }
    }
    printArray(arr, arr_size);
}
}
