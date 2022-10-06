package Lion221006;

public class RandomAlphabet {
    public static void main(String[] args) {
        for (int i = 1; i<=50; i++) {
            char ch = (char)((Math.random() * 26) + 65);
            System.out.printf(ch + " ");
        }
    }
}
