package org.v1.interview;

import java.util.HashMap;

public class InterviewTask {
    public String removeDuplicatesNotOrderString(String input){
        char[] charArray = input.toCharArray();
        HashMap<Character, Boolean> mp = new HashMap<>();
        StringBuilder output = new StringBuilder();

        for (char c : charArray) {
            if (!mp.containsKey(c))
            {
                output.append(c);
                mp.put(c, true);
            }
        }

        return output.toString();
    }

    public String removeDuplicatesOrderString(String input){
        char[] charArray = input.toCharArray();
        int current = charArray[0];
        boolean found = false;
        StringBuilder output = new StringBuilder();

        for (char c : charArray) {
            System.out.println("c = " + Character.toString(c) + " current = " + Character.toString(current) + " found = " + found);
            if (current == c && !found) {
                found = true;
            } else if (current != c) {
                output.append(Character.toString(current));
                current = c;
                found = false;
            }
        }
        // last index can't be different to current and found true this is why last char needs to be added manually
        return output.append(Character.toString(current)).toString();
    }
}
