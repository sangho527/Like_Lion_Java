package Calculator1;

public class CalculatorMain {
    public static void main(String[] args) {
        //NumberMaker numberMaker = new RandomNumberMaker();
        //Calculator randomNumberCalculator = new Calculator(numberMaker); // randomNumberCalculator가 됨
        Calculator calculator = new Calculator(new ByPassNumberCreator());
        calculator.plus(calculator.baseNum);
    }

}
