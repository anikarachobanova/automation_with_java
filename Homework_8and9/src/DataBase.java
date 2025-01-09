//Да се създаде клас DataBase, който съдържа в себе си масив от User[]-и
//Има конструктор, който приема колко голям да е масива
//Има гетър, който ви дава възможност да вземете всички потребители

public class DataBase {
    private User[] allUsers;

    public DataBase (int capacity){
        this.allUsers = new User [capacity];
    }
public User [] getAllUsers (){
        return allUsers;
}

}

