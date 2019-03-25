package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType t : array){
            if(getNumberOfOccurrences(t) % 2 != 0){
                return t;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType t : array){
            if(getNumberOfOccurrences(t) % 2 == 0){
                return t;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for(SomeType t :array){
            if(t.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return Arrays.stream(array)
                .filter(element -> predicate.apply(element))
                .toArray(size -> Arrays.copyOf(array,size));
        }




}
