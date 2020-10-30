package com.company;

public class EscapeTheGhosts {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int myLengthToTarget = Math.abs(target[0]) + Math.abs(target[1]);
        for (int i = 0; i < ghosts.length; i++) {
            int ghostLengthToTarget = Math.abs(ghosts[i][0] - target[0]) + Math.abs(ghosts[i][1] - target[1]);
            if (ghostLengthToTarget <= myLengthToTarget) return false;
        }
        return true;
    }
}
