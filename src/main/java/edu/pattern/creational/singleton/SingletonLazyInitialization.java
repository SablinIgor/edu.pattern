package edu.pattern.creational.singleton;

// пример с инициализацией с поздней инициализацией (Lazy Initialization)
public class SingletonLazyInitialization {
    private static SingletonLazyInitialization _instance = null;

    private SingletonLazyInitialization() {}

    public static synchronized SingletonLazyInitialization getInstance() {
        if (_instance == null)
            _instance = new SingletonLazyInitialization();
        return _instance;
    }
}
