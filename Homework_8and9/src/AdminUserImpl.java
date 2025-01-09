//Да се създаде AdminUserImpl клас, който е User(AbstractUser) и AdminUser
//Всеки AdminUser ще си има собствена база от данни(DataBase) с хардкодната стойност по подразбиране за големината на броя потребители, които могат да
//бъдат създавани.(например всеки AdminUser има възможност да създава по максимум 10 потребителя).
//o Методът, който ще създава потребител, ще се съобразява с това дали да създаде
//нормален потребител или админ, в зависимост от подадените параметри.
//Ако вече има съществуващ потребител с такова име, той НЕ се добавя и се изписва съобщение в конзолата, че е вече съществуващ
//Ако базата данни е вече пълна, ще изписва съобщение, че няма повече място за нови потребители
//Методът, който ще изтрива потребители от базата, просто ще го прави null.
//Ако базата е празна и се опита да изтрие потребител, ще изкарва съобщение в конзолата, че няма какво да се трие от празна база данни.

public class AdminUserImpl extends AbstractUser implements AdminUser{
    private DataBase dataBase;
    private static final int MAX_USERS = 10;

    AdminUserImpl (String username){
        super(username);
        dataBase = new DataBase(MAX_USERS);

    }
    @Override
    public void deleteUser(String username) {
        User[] users = dataBase.getAllUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(username)) {
                users[i] = null;
                System.out.println("User " + username + " has been removed.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    @Override
    public User createUser(String username, boolean isAdmin) {
        User[] users = dataBase.getAllUsers();

        // Check if the user already exists
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(username)) {
                System.out.println("User " + username + " already exists.");
                return null;
            }
        }

        // Check if there is space for a new user
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                User newUser;
                if (isAdmin) {
                    newUser = new AdminUserImpl(username);
                } else {
                    newUser = new UserImpl(username);
                }
                users[i] = newUser;
                System.out.println("User " + username + " has been added.");
                return newUser;
            }
        }

        System.out.println("Database is full. Cannot add more users.");
        return null;
    }


    public void viewAllUsers() {
        User[] users = dataBase.getAllUsers();

        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (user != null) {
                System.out.println("Username: " + user.getUsername() +
                        ", Registration Date: " + user.getRegistrationDate());
            }
        }
    }
    }

