package ua.edu.ucu.apps.msg.user;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.msg.X.XCountry;
import ua.edu.ucu.apps.msg.X.XUser;
import ua.edu.ucu.apps.msg.meta.FacebookUser;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testMyXUserImplementation() {
        XUser xUser = new XUser("xuser@example.com", XCountry.UKRAINE, LocalDate.now());
        MyXUser myXUser = new MyXUser(xUser);
        assertEquals("xuser@example.com", myXUser.getEmail());
        assertEquals("UKRAINE", myXUser.getCountry());
        assertEquals(xUser.getUserActiveTime(), myXUser.getActiveTime());
    }

    @Test
    void testMyMetaUserImplementation() {
        FacebookUser fbUser = new FacebookUser("fbuser@example.com", "USA", LocalDate.now());
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals("fbuser@example.com", myMetaUser.getEmail());
        assertEquals("USA", myMetaUser.getCountry());
        assertEquals(fbUser.getLastActiveTime(), myMetaUser.getActiveTime());
    }

    @Test
    void testUserInterfaceContract() {
        XUser xUser = new XUser("interface@example.com", XCountry.USA, LocalDate.now());
        MyXUser myXUser = new MyXUser(xUser);
        User user = myXUser;
        assertEquals("interface@example.com", user.getEmail());
        assertEquals("USA", user.getCountry());
        assertEquals(xUser.getUserActiveTime(), user.getActiveTime());
    }
}