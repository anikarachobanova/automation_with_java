public class Demo {
    public static void main(String[] args) {
        AdminUserImpl admin = new AdminUserImpl("admin1");
        //UserImpl user = new UserImpl("userOne");
        admin.createUser("user1",false);
        admin.createUser("user2",false);
        admin.createUser("user3",false);
        admin.createUser("user4",false);
        admin.createUser("new admin",true);
        admin.createUser("new user5",false);
        admin.createUser("user6",false);
        admin.createUser("user7",false);
        admin.createUser("new user8",false);
        admin.createUser("new user9",false);
        admin.createUser("new user10",false);//Add user, but the database is full
        admin.createUser("user3",false);//Add user with duplicated username


        admin.viewAllUsers();

        admin.deleteUser("user1");
        admin.deleteUser("user2");
        admin.deleteUser("user3");
        admin.deleteUser("user4");
        admin.deleteUser("new admin");
        admin.deleteUser("new user5");
        admin.deleteUser("user6");
        admin.deleteUser("user6");//Second attempt to delete the same user
        admin.deleteUser("user7");
        admin.deleteUser("new user8");
        admin.deleteUser("new user9");
        admin.deleteUser("new user10");//Delete non existing user

    }
}
