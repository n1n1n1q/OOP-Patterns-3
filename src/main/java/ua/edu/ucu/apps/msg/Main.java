package ua.edu.ucu.apps.msg;

import ua.edu.ucu.apps.msg.X.XCountry;
import ua.edu.ucu.apps.msg.X.XUser;
import ua.edu.ucu.apps.msg.meta.FacebookUser;
import ua.edu.ucu.apps.msg.user.MyMetaUser;
import ua.edu.ucu.apps.msg.user.MyXUser;
import ua.edu.ucu.apps.msg.user.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        XUser Elon = new XUser("elonmusk@bebra.com", XCountry.UKRAINE, LocalDate.of(2024, 12, 1));
        FacebookUser Mark = new FacebookUser("markzubebe@slavuta.ua", "Slavutia", LocalDate.of(148, 7, 1));
        MyXUser myXUser = new MyXUser(Elon);
        MyMetaUser myMetaUser = new MyMetaUser(Mark);
        process(myXUser);
        process(myMetaUser);
    }
    public static void process(User user) {
        System.out.println(user.getActiveTime().toString());
        System.out.println(user.getCountry());
        System.out.println(user.getEmail());
    }
}
