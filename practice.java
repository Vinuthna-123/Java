public class practice {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        // Merge the arrays until one of them is exhausted
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        // // Copy the remaining elements of arr1, if any
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }
        // Copy the remaining elements of arr2, if any
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6,10};
        int[] arr2 = {4,5,6,9,12};

        int[] mergedArray = mergeArrays(arr1, arr2);

        // Print the merged array
        System.out.println("Merged array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}

