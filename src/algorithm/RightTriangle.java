package algorithm;

public class RightTriangle {
    /*public static void main(String[] args) { // 벽에 붙은 트리 단순 출력
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }*/

    /*public void PrintStar(int n){ // 벽에 붙은 트리 반복문
        for (int i = 0; i<n; i++) {
            for (int j = 0; j <=i; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle();
        rt.PrintStar(10);
    }*/

    public void PrintStar(int N){ // 트리 완성본

       for(int i = 0; i < N; i++) {
           // 공백 출력

           for (int j = N - 1 - i; j > 0 ; j--) {
               System.out.printf(" ");
           }

               for (int k = 0; k < 2*i+1; k++){
                   System.out.printf("*");

               }
               System.out.println();
           }
       }


    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle();
        rt.PrintStar(5);

    }

}
