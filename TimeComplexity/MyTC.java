

public class MyTC {
    public static void main(String[] args) {
        
        // Time Complexity
        /*
         * The rate of time taken by the program based on input size
         * If our code depends on external input, then we need to calculate time complexity
         * Otherwise it will be constant time
         */

        // O(n)
        int n = 10; // external input
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        // Eg: O(n)

        // O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+j);
            }
        }

        // O(n+m)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int j = 0; j < m; j++) {
            System.out.println(j);   
        }

        // O(n*m)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            for (int j = 0; j < m; j++) {
            
            }
        }

        // Binary Search
        
       


    }
}