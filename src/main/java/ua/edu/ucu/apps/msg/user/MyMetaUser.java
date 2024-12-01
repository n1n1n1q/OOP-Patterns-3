package ua.edu.ucu.apps.msg.user;

import ua.edu.ucu.apps.msg.meta.FacebookUser;

import java.time.LocalDate;

public class MyMetaUser implements User {
    FacebookUser user;
    public MyMetaUser(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDate getActiveTime() {
        return user.getLastActiveTime();
    }
}
