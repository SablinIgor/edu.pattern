package edu.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SingletonDoubleCheckedTest {

    @Test
    public void testSingleton (){
        SingletonDoubleChecked test = SingletonDoubleChecked.getInstance();
        SingletonDoubleChecked test2 = SingletonDoubleChecked.getInstance();

        assertSame(test, test2);
    }
}
