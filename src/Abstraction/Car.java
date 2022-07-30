package Abstraction;

public abstract class Car extends Vehicle {


    @Override
    public void move() {
        System.out.println("Movement");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning Right");
    }

    public abstract void turnLeft();

}
