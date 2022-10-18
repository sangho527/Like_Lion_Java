package algorithm;

public class SquareStar {

    public void printSqure(int n){
        for (int i = 0; i < n; i++){
            System.out.println("***");
        }
    }



    public static void main(String[] args) {
//        System.out.println("***");
//        System.out.println("***");
//        System.out.println("***");
        SquareStar SS = new SquareStar();
        SS.printSqure(3);
    }
}
