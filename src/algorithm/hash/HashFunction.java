package algorithm.hash;

public class HashFunction {
    public int hash(String key) {
        for (int i = 0; i < key.length(); i++){
            char c = key.charAt(i);
            System.out.println(c);
        }
        return 0;
    }


    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        hf.hash("sangho");
    }
}
