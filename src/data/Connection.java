package data;

public class Connection {
    private static ItemDb instance;

    private Connection() {
    }

    public static ItemDb getInstance() {
        if (instance != null)
            return instance;
        instance = new ItemDb();
        return instance;
    }
}