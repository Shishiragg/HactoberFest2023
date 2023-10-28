class Solution {
    public int coinChange(int[] coins, int sum) {
        int n=coins.length;
        int[][] dp=new int[n+1][sum+1];
	    for(int i=0;i<n+1;i++){
	        for(int j=0;j<sum+1;j++){
	            if(i==0){
	                dp[i][j]=Integer.MAX_VALUE-1;
	            }
	            else if(j==0){
	                dp[i][j]=0;
	            }
	           /* else if(i==1){
	                if(j%coins[i-1]==0){
	                    dp[i][j]=j/coins[i-1];
	                }
	                else{
	                    dp[i][j]=Integer.MAX_VALUE-1;
	                }
	            }*/
	            
	            else{
	                if(coins[i-1]>j){
	                    dp[i][j]=dp[i-1][j];
	                }
	                else{
	                    dp[i][j]=Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
	                }
	            }
	        }
	    }
	    if(dp[n][sum]==Integer.MAX_VALUE-1){return -1;}
	    return dp[n][sum];
    }
}
