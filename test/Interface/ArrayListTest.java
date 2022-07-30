package Interface;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    List list = new ArrayList<>();
    @BeforeEach
    void setup(){
        list = new ArrayList<>();
    }

    @Test public void addTest(){
        list.add("Boxers for boyfriend");
        assertEquals(1, list.size());
    }

    @Test
    public void addAndGetTest(){
        list.add("String on aguitar");
        list.add("Protective Gear");
        assertEquals("Protective Gear", list.get(1));
    }

    @Test
    public void removeTest(){
        list.add("String on aguitar");
        list.remove(0);
        assertEquals(0, list.size());
    }

}