/*1. Climbing stairs to reach the top
        https://www.geeksforgeeks.org/dsa/count-ways-reach-nth-stair/ */

package Dynamic_Programming;

public class Answers_DP_3 {
    public static void main(String args []){
        Answers_DP_3 co = new Answers_DP_3();
        int[] cost = { 16, 19, 10, 12, 18 };
        System.out.println(co.minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // cost of possession = cost to jump
        // when only one stair is there
        if(n==1) return cost[0];
        if(n==2) return cost[1];

        int stair_1 = cost[0];
        int stair_2 = cost[1];

        for(int i=2;i<n;i++){
            int curr = cost[i] + Math.min(stair_1, stair_2);
            stair_1 = stair_2;
            stair_2 = curr;
        }
        return Math.min(stair_1, stair_2);
    }
}




