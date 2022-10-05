
public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.plus(10, 20);
        calculator.minus(10, 20);
        calculator.multiple(10, 20);
        calculator.divide(10, 20);


    }

    public void plus(int first, int second) {
        System.out.println(first + second);
    }
    public void minus(int first, int second) {
        System.out.println(first - second);
    }
    public void multiple(int first, int second) {
        System.out.println(first * second);
    }
    public void divide(double first, double second) {
        System.out.println(first / second);
    }
}
