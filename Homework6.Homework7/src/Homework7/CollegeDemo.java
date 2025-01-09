package Homework7;

public class CollegeDemo {
    public static void main(String[] args) {

        //Да се напише клас College (с main метод), който демонстрира използването на класовете Student и StudentGroup
        //Създава няколко студента, добавя стипендия на някои от тях, прехвърля някои от тях в по-горна година.
        //Създава няколко групи от студенти, добавя студенти в тях, изкарва името на най-добрия студент от някоя от групите....)


        Student student1 = new Student("Katia", "Computer Science", 22);
        Student student2 = new Student("Boris", "Computer Science", 25);
        Student student3 = new Student("Iva", "Computer Science", 5, 3, 23);
        Student student4 = new Student("Elena", "Computer Science", 3, 2, 24);
        Student student5 = new Student("Nikola", "Mathematics", 5, 3, 29);
        Student student6 = new Student("Georgi", "Mathematics", 3, 3, 25);

        StudentGroup group1 = new StudentGroup();
        StudentGroup group2 = new StudentGroup("Mathematics");
        StudentGroup group3 = new StudentGroup("Computer Science");

        group2.addStudent(student5);
        group2.addStudent(student6);
        group3.addStudent(student3);
        group3.addStudent(student1);
        group3.addStudent(student4);
        group3.addStudent(student6);

        student1.receiveScholarship(5, 200);
        student5.receiveScholarship(4, 100);
        student3.receiveScholarship(3, 80);

        student2.upYear();
        student3.upYear();
        student4.upYear();

        group2.theBestStudent();
        group3.theBestStudent();

        group1.printStudentsInGroup();
        group2.printStudentsInGroup();
        group3.printStudentsInGroup();


    }
}
