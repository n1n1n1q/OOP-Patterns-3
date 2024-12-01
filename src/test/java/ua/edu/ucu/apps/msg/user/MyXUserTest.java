package ua.edu.ucu.apps.msg.user;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.msg.X.XCountry;
import ua.edu.ucu.apps.msg.X.XUser;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MyXUserTest {

    @Test
    void testGetEmail() {
        XUser xUser = new XUser("test@example.com", XCountry.USA, LocalDate.now());
        MyXUser myXUser = new MyXUser(xUser);
        assertEquals("test@example.com", myXUser.getEmail());
    }

    @Test
    void testGetCountry() {
        XUser xUser = new XUser("test@example.com", XCountry.UKRAINE, LocalDate.now());
        MyXUser myXUser = new MyXUser(xUser);
        assertEquals("UKRAINE", myXUser.getCountry());
    }

    @Test
    void testGetActiveTime() {
        LocalDate activeTime = LocalDate.of(2023, 10, 1);
        XUser xUser = new XUser("test@example.com", XCountry.COMBODIA, activeTime);
        MyXUser myXUser = new MyXUser(xUser);
        assertEquals(activeTime, myXUser.getActiveTime());
    }
}