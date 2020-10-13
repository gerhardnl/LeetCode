package com.company;

public class SorttheMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        int[] count = new int[101];
        int m = mat.length;
        int n = mat[0].length;

        for (int k = 1 - m; k < n; k++) {
            int x;
            int y;

            if (k < 0) {
                x = -k;
                y = 0;
            } else {
                x = 0;
                y = k;
            }

            for (int i = 1; i <= 100; i++) {
                count[i] = 0;
            }

            for (int i = x, j = y; i < m && j < n; i++, j++) {
                count[mat[i][j]]++;
            }

            int poz = 1;

            for (int i = x, j = y; i < m && j < n; i++, j++) {
                while (count[poz] == 0) {
                    poz++;
                }
                mat[i][j] = poz;
                count[poz]--;
            }
        }

        return mat;


    }
}
