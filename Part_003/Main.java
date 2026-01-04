public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1, 2, 3, 4, 5};

        singleLoop(n);
        nestedLoop(n);
        logarithmicLoop(n);
        simpleRecursion(n);
        triangularLoop(n);
        printPairs(arr);
        fibonacci(5);
        recursionWithLoop(n);
        createArray(n);
        binarySearch(arr, 3);
    }

    // --------------------------------------------------
    // 1. Single Loop
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // --------------------------------------------------
    static void singleLoop(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // --------------------------------------------------
    // 2. Nested Loop
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // --------------------------------------------------
    static void nestedLoop(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // --------------------------------------------------
    // 3. Logarithmic Loop
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    // --------------------------------------------------
    static void logarithmicLoop(int n) {
        int i = 1;
        while (i < n) {
            i = i * 2;
        }
    }

    // --------------------------------------------------
    // 4. Simple Recursion
    // Time Complexity: O(n)
    // Space Complexity: O(n)  (recursion stack)
    // --------------------------------------------------
    static void simpleRecursion(int n) {
        if (n <= 0) return;
        simpleRecursion(n - 1);
    }

    // --------------------------------------------------
    // 5. Triangular Loop
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // --------------------------------------------------
    static void triangularLoop(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // --------------------------------------------------
    // 6. Pair Printing
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // --------------------------------------------------
    static void printPairs(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }

    // --------------------------------------------------
    // 7. Fibonacci (Recursive)
    // Time Complexity: O(2^n)
    // Space Complexity: O(n)
    // --------------------------------------------------
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // --------------------------------------------------
    // 8. Recursion + Loop
    // Time Complexity: O(n)
    // Space Complexity: O(log n)
    // --------------------------------------------------
    static void recursionWithLoop(int n) {
        if (n == 0) return;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        recursionWithLoop(n / 2);
    }

    // --------------------------------------------------
    // 9. Extra Array Allocation
    // Time Complexity: O(1)
    // Space Complexity: O(n)
    // --------------------------------------------------
    static int[] createArray(int n) {
        return new int[n];
    }

    // --------------------------------------------------
    // 10. Binary Search (Iterative)
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    // --------------------------------------------------
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // --------------------------------------------------
    // 11. THEORY QUESTIONS (No Code)
    // --------------------------------------------------

    /*
    Q: What does Big-O represent?
    A: Worst-case time complexity.

    Q: Which is better?
        O(n log n) vs O(n^2) -> O(n log n)
        O(n) vs O(log n)     -> O(log n)

    Q: Arrange in increasing order of growth:
        O(1) < O(log n) < O(n) < O(n log n) < O(n^2)
    */

}