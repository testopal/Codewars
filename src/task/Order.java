package task;

// Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//         Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//         If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    public static String order(String words) {
        if (words.length()<1) return words;
        List<String> aList = Arrays.asList(words.split(" "));
        char[] CHar = new char[]{'1','2','3','4','5','6','7','8','9'};
        for (int i=0; i< aList.size();i++ ){
            for (char ch : CHar){
                if (aList.get(i).indexOf(ch) > 0) {

                }
            }
        }

        return words;
    }
}
