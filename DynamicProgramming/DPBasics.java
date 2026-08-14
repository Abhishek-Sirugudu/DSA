package DynamicProgramming;

public class DPBasics {
    private static int fib(int n){
        if(n <= 1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    private static int memoFib(int n,int[] memo){
        if(n <= 1){
            return n;
        }
        if(memo[n] != 0){
            return memo[n];
        }

        memo[n] = memoFib(n-1,memo) + memoFib(n-2,memo);

        return memo[n];
    }


    private static int tabFib(int n){
        if(n <= 1){
            return n;
        }
        int[] tab = new int[n+1];

        tab[0] = 0;
        tab[1] = 1;

        for(int i = 2; i <= n; i++){
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[n];
    }

    private static int optFib(int n){
        if(n <= 1){
            return n;
        }

        int prev0 = 0,prev1 = 1;
        for(int i = 2; i < n; i++){
            int cur  = prev0+prev1;
            prev0 = prev1;
            prev1 = cur;
        }
        return prev1;
    }

    private static int recClimbingStairs(int n){
        if(n <= 2){
            return n;
        }
        return recClimbingStairs(n-1)+recClimbingStairs(n-2);
    }

    private static int memoClimbinsStairs(int[] dp,int n){
        if(n <= 2){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] = memoClimbinsStairs(dp,n-1) + memoClimbinsStairs(dp,n-2);
    }

    private static int tabClimbingStairs(int n){
        if( n <= 2){
            return n;
        }
        int[] dp = new int[n+1];

         dp[1] = 1;
         dp[2] = 2;

         for(int i = 3; i<= n; i++){
             dp[i] = dp[i-1] + dp[i-2];
         }
         return dp[n];
    }

    private static int optClimbingStairs(int n){
        if( n <= 2){
            return n;
        }
        int prev1 = 1,prev = 2;

        for(int i = 2; i < n; i++){
            int cur = prev1 + prev;
            prev1 = prev;
            prev = cur;
        }
        return prev;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(5));
        int[] memo = new int[n+1];
        System.out.println(memoFib(5,memo));

        System.out.println(tabFib(20));
    }
}
