//Да се създаде abstract-ен клас AbstractUser, който е User
//(помислете какво бихте изнесли в него, какво общо има между потребителите и т.н.)

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class AbstractUser implements User{
    private String username;
    private String registrationDate;
    private boolean isLogged;

   public AbstractUser (String username){
        this.username = username;
        this.registrationDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        this.isLogged = false;
    }

    @Override
    public void login(String username) {
        isLogged = true;
        System.out.println(username+"has logged in");


    }

    @Override
    public void logout(String username) {
        isLogged = false;
        System.out.println(username+"has logged out");

    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getRegistrationDate() {
        return registrationDate;
    }
}
