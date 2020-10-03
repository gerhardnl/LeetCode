package com.company;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int seconds = 0;

        int firstPointer = points[0][0];
        int secondPointer = points[0][1];

        for (int i = 1; i <points.length ; i++) {

            while ((firstPointer != points[i][0]) || (secondPointer != points[i][1])) {
                if (firstPointer > points[i][0]) firstPointer--;
                else if (firstPointer < points[i][0]) firstPointer++;

                if (secondPointer > points[i][1]) secondPointer--;
                else if (secondPointer < points[i][1]) secondPointer++;

                seconds++;
            }

        }
        return seconds;

    }
}
