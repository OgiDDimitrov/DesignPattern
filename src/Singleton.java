public class Singleton {
    private static Singleton instance;
    private int counter;

    private Singleton() {
        counter = 0;
        System.out.println("Singleton is Initialized.");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void doSomething() {
        counter++;
        System.out.println("Something is Done." + counter);
    }
}
