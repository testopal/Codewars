package task;

// Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//         Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//         If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Order {
    private static boolean Finding = false;

    public static String order(String words) {
        if (words.length()<1) return words;
        List<String> aList = Arrays.asList(words.split(" "));
        do {
            for (int i = 0; i < aList.size(); i++) {
                if (i==0)  Finding = false;
                aList = FindChar(aList, i);
            }
            words = aList.toString();
            words = String.join(" ", aList);
        } while (Finding);
        return words;
    }

    private static List FindChar(List<String> aList, int i) {
        String words, temp;

        for (int ch = 1; ch<=9; ch++){
            if (i != ch-1){
            temp =  aList.get(i);
            int index = temp.indexOf(String.valueOf(ch) );
            if (index != -1) {
                aList.set(i, aList.get(ch-1)) ;
                aList.set(ch-1, temp) ;
                Finding = true;
                break;
            }
            }
        }
        return aList;
    }
}
