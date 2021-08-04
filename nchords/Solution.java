public class Solution {
    public int chordCnt(int A) {
        int [] dp = new int[A+1];
        dp[0] = 1;
        dp[1] = 1;
            
        for(int i=2;i<=A;i++)
        {
            int k=i-1;
            dp[i]=0;
            for(int j=0;j<=k;j++)
            {
                dp[i]= (dp[i] + (dp[k-j]*dp[j]));
            }
            
        }

        return dp[A];

    }
}
