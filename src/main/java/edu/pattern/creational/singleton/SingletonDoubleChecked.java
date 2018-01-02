package edu.pattern.creational.singleton;

public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked _instance = null;

    private SingletonDoubleChecked() {}

    public static synchronized SingletonDoubleChecked getInstance() {
        if (_instance == null)
            synchronized (SingletonDoubleChecked.class) {
                if (_instance == null)
                    _instance = new SingletonDoubleChecked();
            }
        return _instance;
    }
}
