package Abstraction;

public class Main {

    public static void main(String[] args) {
        Vehicle a = new Vehicle() {
            @Override
            public void move() {
                System.out.println("moving");
            }

            @Override
            public void turnRight() {
                System.out.println("turned right");
            }
        };

         Car b = new Car() {
             @Override
             public void turnLeft() {
                 System.out.println("we turned left");
             }
         };
         b.turnLeft();
         b.move();
    }

}
