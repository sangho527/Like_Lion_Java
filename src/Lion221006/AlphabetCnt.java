package Lion221006;

public class AlphabetCnt {
    public boolean isAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            return true;
        }
        return false;
    }
}
