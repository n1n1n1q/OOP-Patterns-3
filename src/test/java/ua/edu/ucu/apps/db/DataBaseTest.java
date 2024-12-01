package ua.edu.ucu.apps.db;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    @Test
    void testGetUserData() {
        DataBase db = new DataBase();
        String userData = db.getUserData();
        assertEquals("hello", userData);
    }

    @Test
    void testGetStatisticsData() {
        DataBase db = new DataBase();
        String statsData = db.getStatisticsData();
        assertEquals("hello2", statsData);
    }

    @Test
    void testDeprecatedGetUserData() {
        DataBase db = new DataBase();
        String userData = db.отриматиДаніКористувача();
        assertEquals("hello", userData);
    }

    @Test
    void testDeprecatedGetStatisticsData() {
        DataBase db = new DataBase();
        String statsData = db.отриматиСтатистичніДані();
        assertEquals("hello2", statsData);
    }
}