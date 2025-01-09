//Да се създаде интерфейс User –
//юзърите трябва да могат да се логват(метод, който променя state-a на логнат)
//да се логаутват(метод, който променя state-a на логаутнат)
//да се взима username на всеки юзър(метод, който връща String съдържащ username-a, на потребителя)
//да се взима датата, на която се е регистрирал(метод, който връща String съдържащ датата, на която потребителя е бил създаден)

public interface User {
    void login (String username);
    void logout (String username);
    String getUsername();
    String getRegistrationDate ();



}
