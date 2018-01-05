package edu.pattern.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BundledShapeCacheTest {

    @Test
    public void testPrototypeCache () {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        assertNotSame(shape1, shape2);
        assertFalse(shape1.equals(shape2));

        assertNotSame(shape2, shape3);
        assertTrue(shape2.equals(shape3));
    }
}
