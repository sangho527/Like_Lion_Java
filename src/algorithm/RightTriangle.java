package algorithm;

public class RightTriangle {
    /*public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }*/

    public void PrintStar(int n){
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
    }

}
