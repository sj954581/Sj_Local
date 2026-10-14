//4. Minimum Partition
//https://www.geeksforgeeks.org/dsa/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum/
package Dynamic_Programming;
import java.util.*;

class Answers_DP_4 {
        static int minDifference(List<Integer> arr) {
            int sumTotal = 0;

            // Calculate total sum of the array
            for (int num : arr) {
                sumTotal += num;
            }

            // Create a 1D DP array to track
            // achievable subset sums
            boolean[] dp = new boolean[sumTotal + 1];
            dp[0] = true;

            // Fill the DP array
            for (int num : arr) {
                for (int sum = sumTotal; sum >= num; sum--) {
                    dp[sum] = dp[sum] || dp[sum - num];
                }
            }

            // Find the minimum difference
            int minDiff = sumTotal;
            for (int sum = 0; sum <= sumTotal / 2; sum++) {
                if (dp[sum]) {
                    minDiff = Math.min(minDiff,
                            Math.abs((sumTotal - sum) - sum));
                }
            }

            return minDiff;
        }

        public static void main(String[] args) {
            List<Integer> arr = Arrays.asList(1, 6, 11, 5);

            System.out.println(minDifference(arr));
        }
    }