package ua.edu.ucu.apps.db;

public class DataBase extends БазаДаних{
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }
    public String getStatisticsData() {
        return super.отриматиСтатистичніДані();
    }
    @Override @Deprecated
    public String отриматиДаніКористувача() {
        return super.отриматиДаніКористувача();
    }
    @Override @Deprecated
    public String отриматиСтатистичніДані() {
        return super.отриматиСтатистичніДані();
    }
}
