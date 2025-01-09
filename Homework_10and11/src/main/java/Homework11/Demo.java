package Homework11;

public class Demo {
    public static void main(String[] args) {
        try {
            // Try creating a Person object with some invalid values
            //This where my problem comes... Why cannot get it to throw all errors while setting the values, it only throws the first error for age
            Person person = new Person("Ani", -25, -20, -5);
        } catch (InvalidValueExceptionAge e) {
            e.printStackTrace();
            System.out.println("Age Error: " + e.getMessage());
        } catch (InvalidValueExceptionHeight e) {
            e.printStackTrace();
            System.out.println("Height Error: "+ e.getMessage());
        } catch (InvalidValueExceptionWeight e) {
            e.printStackTrace();
            System.out.println("Weight Error: "+ e.getMessage());
        }

        try {
            // Creating a valid Person object
            Person person1 = new Person("John", 30, 175, 70.0);
            System.out.println(person1);

            // Attempt to set an invalid age
            person1.setWeight(18);
        } catch (InvalidValueExceptionAge e) {
            e.printStackTrace();
            System.out.println("Age Error: " + e.getMessage());
        } catch (InvalidValueExceptionHeight e) {
            e.printStackTrace();
            System.out.println("Height Error: " + e.getMessage());
        } catch (InvalidValueExceptionWeight e) {
            e.printStackTrace();
            System.out.println("Weight Error: " + e.getMessage());
        }

        try{
            Person person2 = new Person("Stefan",30,120,70);
        }
        catch (InvalidValueExceptionHeight | InvalidValueExceptionAge | InvalidValueExceptionWeight e){
            e.printStackTrace();
            System.out.println("Height Error: "+ e.getMessage());
        }

    }
}


