package tddClass;

import chapterThree.Car;
import org.junit.jupiter.api.Test;

public class CarApplicationTest {

    @Test
    public void carCapabilities(){
        Car myCar = new Car("Camry", "2011", 5000000);
    }

}
