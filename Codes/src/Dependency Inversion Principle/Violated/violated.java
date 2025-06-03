class MySQLDatabase {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class App {
    private MySQLDatabase db = new MySQLDatabase(); // tightly coupled

    public void start() {
        db.connect();
    }
}

