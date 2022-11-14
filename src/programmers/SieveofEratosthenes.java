package programmers;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N - 1]; // idx는 0~48 숫자는 2~50
        System.out.println(arr.length);

        // 2 ~ 50까지 값 채우기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }


        System.out.printf("%d %d\n", 0, arr[0]);
        System.out.printf("%d %d\n", arr.length - 1, arr[arr.length - 1]);
    }

}
