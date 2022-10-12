package algorithm;

public class Max03 {
    public int getMax(int[] arr) {
        //loop 구성
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};
        Max03 max02 = new Max03();
        int result = max02.getMax(arr);
        if (result == -3) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. result:" + result);
        }
    }
}