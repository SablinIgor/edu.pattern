package edu.pattern.creational.singleton;

// пример с инициализацией при загрузке класса
public class SingletonClassLoad {
    private static SingletonClassLoad _instance = new SingletonClassLoad();

    private SingletonClassLoad() {}

    public static synchronized SingletonClassLoad getInstance() {
        return _instance;
    }
}
