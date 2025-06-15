public class SubArray {
    public String isSubset(long a1[], long a2[], long n, long m) {
        // If number of elements in a2 is greater than a1, a2 cannot be a subset of a1
        if (m > n) {
            return "No";
        }
        
        // Use a boolean array to mark visited elements of a1
        boolean[] visited = new boolean[(int) n];
        
        // Mark all elements of a1 as not visited initially
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }
        
        // For each element of a2, search for it in a1
        for (int i = 0; i < m; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (a2[i] == a1[j]) {
                    visited[i] = true;
                    found = true;
                    break;
                }
            }
            // If element of a2 is not found in a1, return "No"
            if (!found) {
                return "No";
            }
        }
        
        // If all elements of a2 are found in a1, return "Yes"
        return "Yes";
    }

    public static void main(String[] args) {
        long[] a1 = {1, 2, 3, 4, 5};
        long[] a2 = {1, 4, 5};
        long n = a1.length;
        long m = a2.length;
        SubArray compute = new SubArray();
        String result = compute.isSubset(a1, a2, n, m);
        System.out.println("Is a2 a subset of a1? " + result);
    }
}

