package com.company;

public class UniquePaths {
    private int row;
    private int col;
    private int count = 0;
    private int[][] dp;


    public int uniquePaths(int m, int n) {
        row = m;
        col = n;
        dp = new int[row][col];
        init();
        dfs(0, 0);
        return dp[0][0];
    }

    private void init() {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                dp[i][j] = -1;
    }

    private int dfs(int i, int j) {

        if (i >= row || j >= col)
            return 0;

        if (i == row - 1 && j == col - 1) {
            dp[i][j] = 1;
            return 1;
        }

        if (dp[i][j] != -1)
            return dp[i][j];

        int path1 = dfs(i, j + 1);
        int path2 = dfs(i + 1, j);
        dp[i][j] = path1 + path2;
        return dp[i][j];
    }
}
