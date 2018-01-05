package edu.pattern.creational.prototype;

import org.junit.Test;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class PrototypeTest {
    @Test
    public void testPrototype (){
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;

        Circle circleClone;

        circleClone = (Circle) circle.clone();

        assertNotSame(circle, circleClone);
        assertTrue(circle.equals(circleClone));
    }
}
