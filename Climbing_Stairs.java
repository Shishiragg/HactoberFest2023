class Solution {
    public int climbStairs(int n) {
        int[] help= new int[n+1];
        Arrays.fill(help,-1);
        help[1]=1;
        if(n>=2){
        help[2]=2;
        }
        return helping(help,n);
       

    }
    public int helping(int[] help, int n){
         if(help[n]==-1){
            help[n-1]=helping(help,n-1);
            help[n-2]=helping(help,n-2);
            help[n]=help[n-1]+help[n-2];
            return help[n];
        }
        else{
            return help[n];
        }
    }
}
