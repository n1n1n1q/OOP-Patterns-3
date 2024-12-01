package ua.edu.ucu.apps.msg.user;

import ua.edu.ucu.apps.msg.X.XUser;

import java.time.LocalDate;

public class MyXUser implements User{
    XUser user;
    public MyXUser(XUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry().toString();
    }

    @Override
    public LocalDate getActiveTime() {
        return user.getUserActiveTime();
    }
}
