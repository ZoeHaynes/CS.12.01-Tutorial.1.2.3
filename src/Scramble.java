import java.util.ArrayList;
import java.util.List;

public class Scramble {
    //properties
    //constructors
    public Scramble(){

    }
    //methods
    public static String scrambleWord(String word){
        for(int i =0; i<word.length()-1; i++){
            if(word.charAt(i)=='A' && word.charAt(i+1)!='A'){
                char nextChar = word.charAt(i+1);
                String wordScrambled = ""+nextChar+'A';
                word = word.substring(0, i) + wordScrambled + word.substring(i+2);
                i++;


            }

        }

        return word;


    }

    public static void scrambleOrRemove(List<String> list){
        for(int i = 0; i<list.size(); i++){
            String word = list.get(i);
            String scrambledWord = scrambleWord(word);
            list.set(i,scrambledWord);
            if(word == scrambledWord){
                list.remove(i);
                i--;
            }



            }

        }


}
