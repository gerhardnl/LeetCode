package com.company;

public class Strings {

    public void splitSting() {
        String string = "j-e-g--h-a-r--e-n--h-u-n-d";

        String[] split = string.split("-");

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);

        }

    }

    public void reversString() {
        String string = "j-e-g--h-a-r--e-n--h-u-n-d";

        String[] split = string.split("-");

        int end = split.length - 1;
        String temp;

        for (int i = 0; i < split.length / 2; i++) {
            temp = split[i];
            split[i] = split[end];
            split[end] = temp;
            end--;

        }
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);

        }
    }

}
