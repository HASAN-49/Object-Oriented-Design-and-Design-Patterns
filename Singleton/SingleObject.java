package Singleton;

public class SingleObject {
    // Create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    // private constructor
    private SingleObject() {}

    // Get the object
    public static SingleObject getInstance() {
        return instance;
    }

    // Show message
    public void showMessage() {
        System.out.println("Hello world!!");
    }
}
