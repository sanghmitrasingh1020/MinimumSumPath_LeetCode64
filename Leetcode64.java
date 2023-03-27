package LeetCode64.java;

public class Leetcode64 {
    public int minPathSum(int[][] grid){
        int[][]dp=new int[grid.length][grid[0].length];

        for(int row=0;row<dp.length;row++){
            for(int col=0;col<dp[0].length;col++){
                if(row==0 && col==0){
                    dp[0][0]=grid[0][0];
                } else if(row==0 ){
                    dp[row][col]=grid[row][col]+dp[row][col-1];
                }else if(col==0 ){
                    dp[row][col]=grid[row][col]+dp[row-1][col];
                }else{
                    dp[row][col]=grid[row][col]+Math.min(dp[row][col-1],dp[row-1][col]);
                }
            }
        }
        return(dp[dp.length-1][dp[0].length-1]);
    }
}
