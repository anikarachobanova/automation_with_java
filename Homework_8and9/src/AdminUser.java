//Да се създаде интерфейс AdminUser, като той е и User – админ юзърите ще могат да правят всичко, което и нормалните, но също така, ще могат и да –
//Изтриват юзър, който ще намират на базата на неговия username
//Ще могат да създават нови юзъри и от тях ще зависи дали те ще могат да са админи или не(метод, който приема два параметъра, за username и дали е админ)
//и връща, като стойност създадения нов User.
//Ще могат да преглеждат всички потребители, метод който принтира цялата информация за всеки един потребител в конзолата(без значение дали е админ или не)

public interface AdminUser extends User {
    public void deleteUser (String username);
    public User createUser (String username, boolean isAdmin);
    public void viewAllUsers ();
}