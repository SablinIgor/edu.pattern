package edu.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SingletonClassLoadTest {

    @Test
    public void testSingleton (){
        SingletonClassLoad test = SingletonClassLoad.getInstance();
        SingletonClassLoad test2 = SingletonClassLoad.getInstance();

        assertSame(test, test2);
    }
}
