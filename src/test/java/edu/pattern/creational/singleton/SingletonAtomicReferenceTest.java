package edu.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SingletonAtomicReferenceTest {

    @Test
    public void testSingleton (){
        SingletonAtomicReference test = SingletonAtomicReference.getInstance();
        SingletonAtomicReference test2 = SingletonAtomicReference.getInstance();

        assertSame(test, test2);
    }
}
