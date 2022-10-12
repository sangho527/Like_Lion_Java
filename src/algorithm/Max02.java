package algorithm; //221012

public class Max02 {

    //arr을 받아서 최대값을 구하고 int로 리턴

    /*
    * return: maxValue, maxIdx
    * */
    public int[] getMax(int[] arr) {

        //loop 구성
        int maxIdx = 0;
        int maxValue = arr[0]; //arr가 모두 음수인 경우 0으로 하면 0이 max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }

        return new int[]{maxValue, maxIdx};

    }


    public static void main(String[] args) {
        int[] arr = //new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
                arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};
        Max02 max02 = new Max02();
        int[] result = max02.getMax(arr);
        if (result[0] == -3 && result[1] == 0) {
            System.out.println("테스트 통과 했습니다.");
        }
        else {
            System.out.println("테스트 실패입니다. result" + result);
        }

    }
}