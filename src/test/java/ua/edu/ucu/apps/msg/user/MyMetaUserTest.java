package ua.edu.ucu.apps.msg.user;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.msg.meta.FacebookUser;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MyMetaUserTest {

    @Test
    void testGetEmail() {
        FacebookUser fbUser = new FacebookUser("fb@example.com", "USA", LocalDate.now());
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals("fb@example.com", myMetaUser.getEmail());
    }

    @Test
    void testGetCountry() {
        FacebookUser fbUser = new FacebookUser("fb@example.com", "Canada", LocalDate.now());
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals("Canada", myMetaUser.getCountry());
    }

    @Test
    void testGetActiveTime() {
        LocalDate activeTime = LocalDate.of(2023, 10, 1);
        FacebookUser fbUser = new FacebookUser("fb@example.com", "USA", activeTime);
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals(activeTime, myMetaUser.getActiveTime());
    }

    @Test
    void testNullFacebookUser() {
        MyMetaUser myMetaUser = new MyMetaUser(null);
        assertThrows(NullPointerException.class, () -> {
            myMetaUser.getEmail();
        });
    }

    @Test
    void testEmptyEmail() {
        FacebookUser fbUser = new FacebookUser("", "USA", LocalDate.now());
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals("", myMetaUser.getEmail());
    }

    @Test
    void testEmptyCountry() {
        FacebookUser fbUser = new FacebookUser("fb@example.com", "", LocalDate.now());
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals("", myMetaUser.getCountry());
    }

    @Test
    void testFutureActiveTime() {
        LocalDate futureDate = LocalDate.now().plusDays(10);
        FacebookUser fbUser = new FacebookUser("fb@example.com", "USA", futureDate);
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals(futureDate, myMetaUser.getActiveTime());
    }

    @Test
    void testPastActiveTime() {
        LocalDate pastDate = LocalDate.of(2000, 1, 1);
        FacebookUser fbUser = new FacebookUser("fb@example.com", "USA", pastDate);
        MyMetaUser myMetaUser = new MyMetaUser(fbUser);
        assertEquals(pastDate, myMetaUser.getActiveTime());
    }
}