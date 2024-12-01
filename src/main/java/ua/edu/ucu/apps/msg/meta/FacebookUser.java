package ua.edu.ucu.apps.msg.meta;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String userMail;
    private String country;
    public LocalDate lastActiveTime;

}
