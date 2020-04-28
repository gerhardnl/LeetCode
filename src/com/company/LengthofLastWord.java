package com.company;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int spaces = s.length() - 1;
        while (Character.isSpaceChar(s.charAt(spaces))){
            spaces--;
        }

        for (int i = spaces; i >= 0; i--) {

                if (s.charAt(i) == ' ') {
                    break;
                }
                count++;
            }

            System.out.println(count);
            return count;
        }

    public int lengthOfLastWord_v2(String s){
        s=s.trim();

        if (s.isEmpty()){
            return 0;
        }
        String[] seperated = s.split(" ");
        return seperated[seperated.length -1].length();
    }

    }

