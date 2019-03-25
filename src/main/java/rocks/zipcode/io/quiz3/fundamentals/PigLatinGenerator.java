package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {


    public String translate(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                sb.append(translator(arr[i]));
                sb.append(" ");
            }else{
                sb.append(translator(arr[i]));
            }
        }
        return sb.toString();
    }

    private String translator(String str){
        StringBuilder sb = new StringBuilder();

        if(VowelUtils.hasVowels(str)){
            if(VowelUtils.startsWithVowel(str)){
                sb.append(str);
                sb.append("way");
            }else{
                sb.append(str.substring(VowelUtils.getIndexOfFirstVowel(str), str.length()));
                sb.append(str.substring(0, VowelUtils.getIndexOfFirstVowel(str)));
                sb.append("ay");
            }
        }else {
            sb.append(str);
            sb.append("ay");
        }
        return sb.toString();
    }
}
