package Lab1.data;

abstract public class Connection {
    private static ItemDb instance;

    public static ItemDb getInstance() {
        if (instance != null)
            return instance;
        instance = new ItemDb();
        return instance;
    }
}