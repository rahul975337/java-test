import java.util.*;

/*
Given an array arr[] of N numbers. We can merge two adjacent numbers into one and the cost of merging the two numbers is equal to the sum of the two values. The task is to find the total minimum cost of merging all the numbers.
**/
class GFG {

    static int mergeTwoNumbers(int[] numbers) {
        int len, i, j, k;

        int n = numbers.length;

        if (numbers.length == 0) {
            return 0;
        }

        int[] prefixSum = new int[n + 1];

        for (i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i - 1];
        }

        int[][] dp = new int[n + 1][n + 1];

        for (len = 2; len <= n; len++) {

            for (i = 1; i <= n - len + 1; i++) {
                j = i + len - 1;

                int sum = prefixSum[j] - prefixSum[i - 1];

                dp[i][j] = Integer.MAX_VALUE;

                // Iterate for all possible
                // K to find the minimum cost
                for (k = i; k < j; k++) {

                    // Update the minimum sum
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + sum);
                }
            }
        }

        // Return the final minimum cost
        return dp[1][n];
    }

    // Driver Code
    public static void main(String[] args) {
        // Given set of numbers
        int[] arr1 = { 6, 4, 4, 6 };

        // Function Call
        System.out.print(mergeTwoNumbers(arr1) + "\n");
    }
}
