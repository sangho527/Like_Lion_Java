package programmers;

public class SecretMap {

    // 한변의 길이가 n, 칸은 # or 공백
    // 2진수로 풀이 #은 1, 공백은 0
    // 배열의 수를 2진수로 변경, 비트연산 OR 사용
    // Integer.toBinaryString() 함수로 정수 -> 2진수 변환
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            for (int i = 0; i < n; i++) {
                answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            }
            return answer;
        }
    }

