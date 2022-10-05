package Calculator1;

public class Calculator {
    //numbermaker을 통해 숫자를 받고
    //사칙 연산한 결과를 출력

    NumberCreator numberCreator;
    int baseNum = 10;

    public void plus(int num) {
        System.out.println(num + numberCreator.create(30));
    }

    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }
}

