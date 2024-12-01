package ua.edu.ucu.apps.msg.X;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter @AllArgsConstructor
public class XUser {
    private String email;
    private XCountry userCountry;
    private LocalDate userActiveTime;
}

