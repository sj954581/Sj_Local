/*2. https://www.geeksforgeeks.org/dsa/count-ways-reach-nth-stair-using-step-1-2-3/ */

package Dynamic_Programming;

public class Answers_DP_2 {
    public static void main(String args []){
        Answers_DP_2 co = new Answers_DP_2();
        int n = 4;
        System.out.println(co.countWays(n));
    }

    private int countWays(int n) {
        int stair_1=1;
        int stair_2=2;
        int stair_3=4;
        if(n<=2) return n;
        if(n==3) return 4;

        int ways=0;
        for(int i=4;i<=n;i++){
            ways=stair_1+stair_2+stair_3;
            stair_1=stair_2;
            stair_2=stair_3;
            stair_3=ways;
        }
        return ways;
    }
}




