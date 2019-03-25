package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char cap = str.toUpperCase().charAt(indexToCapitalize);
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(indexToCapitalize, cap);

        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(characterToCheckFor.equals(baseString.charAt(indexOfString))){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> list = new ArrayList<>();
        LinkedHashSet<String> dupDeleter = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                list.add(string.substring(i, j));
            }
        }
        dupDeleter.addAll(list);
        list.clear();
        list.addAll(dupDeleter);
        String[] answer = list.toArray(new String[0]);
        return answer;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
