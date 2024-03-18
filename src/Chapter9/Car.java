package Chapter9;

public class Car extends Vehicle {

    public void move() {
        super.move();
    }

    public void checkModel(){
        System.out.println("my model is camry");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.checkModel();
    }
}
