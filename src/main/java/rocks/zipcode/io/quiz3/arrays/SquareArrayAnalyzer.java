package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        ArrayList<Integer> arr = getSquaredValues(inputArray);
        List<Integer> list = Arrays.asList(squaredValues);
        if(!list.containsAll(arr)){
            return false;
        }
        return true;
    }

    public static ArrayList<Integer> getSquaredValues(Integer[] inputArray){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer num : inputArray){
            list.add(num*num);
        }

        return list;
    }
}
