class Fruit {
        String color;

        Fruit fruit = new Fruit();

        public Fruit(String color) {
            this.color = color;
        }

    public Fruit() {

    }
}

public class Apple extends Fruit {
    double weight;

    public Apple(double weight){
        super();

        this.weight = weight;
    }
}