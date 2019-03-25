package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length() ; i++) {
            StringBuilder sb = new StringBuilder(str.toLowerCase());

            if(Character.isLetter(sb.charAt(i))){
                sb.setCharAt(i, str.toUpperCase().charAt(i));
                list.add(sb.toString());
            }

        }

        String[] wave = list.toArray(new String[0]);
        System.out.println(Arrays.toString(wave));
        return wave;
    }
}
