class Solution {
    public int rob(int[] nums) {
        int[] fun=new int[nums.length];
        Arrays.fill(fun,-1);
        return help(fun,nums.length-1,nums);
    }
    public int help(int[] fun,int n,int[] nums ){
       
        if(n==0){
            return nums[0];
        }
        if(n<0){
            return 0;
        }
         if(fun[n]!=-1){
            return fun[n];
        }
        else{
           
            return fun[n]=Math.max(nums[n]+help(fun,n-2,nums),nums[n-1]+help(fun,n-3,nums));
        }
    }
    
}
