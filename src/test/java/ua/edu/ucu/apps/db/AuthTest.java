package ua.edu.ucu.apps.db;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthTest {

    @Test
    void testAuthorize() {
        DataBase db = new DataBase();
        Auth auth = new Auth();
        boolean result = auth.authorize(db);
        assertTrue(result);
    }

    @Test
    void testDeprecatedAuthorize() {
        DataBase db = new DataBase();
        Auth auth = new Auth();
        boolean result = auth.авторизуватися(db);
        assertTrue(result);
    }
}