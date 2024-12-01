package ua.edu.ucu.apps.db;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Auth auth = new Auth();
        if (auth.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
