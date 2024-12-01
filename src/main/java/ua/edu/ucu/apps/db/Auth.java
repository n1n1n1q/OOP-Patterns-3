package ua.edu.ucu.apps.db;

public class Auth extends Авторизація{
    public boolean authorize (БазаДаних db) {
        return super.авторизуватися(db);
    }
    @Override @Deprecated
    public boolean авторизуватися(БазаДаних db) {
        return super.авторизуватися(db);
    }
}
