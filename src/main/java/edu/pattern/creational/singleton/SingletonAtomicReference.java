package edu.pattern.creational.singleton;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonAtomicReference {
    private static AtomicReference SINGL_REG = new AtomicReference();

    public static int t = 5;

    private SingletonAtomicReference() {}

    public static final SingletonAtomicReference getInstance(){
        if (SINGL_REG.get() == null){
            SINGL_REG.compareAndSet(null, new SingletonAtomicReference());
        }

        return (SingletonAtomicReference)SINGL_REG.get();
    }
}
