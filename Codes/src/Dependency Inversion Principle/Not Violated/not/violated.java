interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class App {
    private Database db;

    public App(Database db) {
        this.db = db;
    }

    public void start() {
        db.connect(); // depends on abstraction
    }
}

// Usage:
Database db = new MySQLDatabase();
App app = new App(db);
app.start();

