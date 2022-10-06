package Lion221006;

/*

Sring str = “abcdefg”;
        위 ascii code표에  대문자 65 ~ 90, 소문자 97~122 if((c >= 65 and c< 90) or ())
        boolean isAlphabet(char c)  — c가 알파벳인지 check하는 function
        Map<String, Integer> map = a~z까지 등록 해놓고 cnt를 1개씩 올린다.
*/

import java.util.HashMap;



public class MapExercise2 {

    /*public boolean isAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'Z')) {
            return true;
        }
        return false;

    }*/

    public static void main(String[] args) {

        AlphabetCnt alphabetCnt = new AlphabetCnt();


        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for (char c = 'A'; c < 'Z'; c++) {
            alphabetMap.put(c, 0);
        }

        String s1 = "adsdhnjskadjks".toUpperCase();

        for (int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if (isAlphabet){
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println(alphabetMap);
    }
}
