package algorithm;

public class RecursiveStar {
    public void printARow(int n , String now) {
        if (n == now.length()) {
            System.out.println("재귀가 끝났습니다.");
            return;
        }
        System.out.println("***");

        printARow(5, now + "*");
    }

    public static void main(String[] args) {
        new RecursiveStar().printARow(5, "");
    }
}
