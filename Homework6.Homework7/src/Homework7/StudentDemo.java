package Homework7;

public class StudentDemo {
    //Да се напише клас Demo (с main метод), който демонстрира използването на класа Student.

    public static void main(String[] args) {

        //Default constructor creates object reference. As additional set the fields that are not part of the default constructor
        Student student1 = new Student ();
        student1.setName("Daniel"); //Setter for name
        student1.setSubject("Mathematics"); //Setter for subject
        student1.setAge(28); //Setter for age

        //Create two object references with the other constructor, which also calls the default one.
        Student student2 = new Student("Maria","Computer Science",22);

        Student student3 = new Student("Kristina", "Computer networks",27);

        //Print the field name for object references that were created above.
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());


        //Calling the method upYear and print proper message when needed.
        student1.upYear();
        student1.upYear();
        student2.upYear();
        student2.upYear();
        student2.upYear();
        student3.upYear();
        student3.upYear();
        student3.upYear();
        student3.upYear();


        //Calling the method receiveScholarship, saving the returned value when possible and print proper message
        student1.receiveScholarship(5,300);
        System.out.println(student1.getMoney());

        student2.receiveScholarship(4,80);
        System.out.println(student2.getMoney());//Make sure the amount is added to the student money

        student3.receiveScholarship(3,50);
        System.out.println(student3.getMoney());//Make sure the amount is added to the student money

    }

}


