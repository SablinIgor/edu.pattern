package edu.pattern.creational.singleton;

// пример с инициализацией при загрузке класса (lazy initialization)
public class SingletonLazyInit {
    private static SingletonLazyInit _instance = new SingletonLazyInit();

    private SingletonLazyInit() {}

    public static synchronized SingletonLazyInit getInstance() {
        return _instance;
    }
}
