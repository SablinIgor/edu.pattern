package edu.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SingletonLazyInitializationTest {

    @Test
    public void testSingleton (){
        SingletonLazyInitialization test = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization test2 = SingletonLazyInitialization.getInstance();

        assertSame(test, test2);
    }
}
