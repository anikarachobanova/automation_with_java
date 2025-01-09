package Homework6;
//New package created
//Class fields are declared as private
//Getter for the class fields

public class Person {
    //Да се направи иерархия от класовете Homework6.Person (parent), Homework6.Student (extends Homework6.Person) и Homework6.Employee (extends Homework6.Person)
    //Класът Homework6.Person репрезентиращ човек да има следните полета:
    //name - име
    //age - години
    //isMan - поле, показващо пола
    //Коструктори:
    //Единствен конструктор, с параметри за всичките полета на класа
    //Метод:
    //Метод showPersonInfo, който показва информация за човека (изписва на конзолата стойността на всичките му полета по подходящ начин)

    //Make fields private
    private String name;
    private int age;
    private final boolean isMan; //Gender cannot be changed

    //Constructor
    Person (String name,int age,boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }


    //Methods:
    void showPersonInfo (){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Homework6.Person: " +
                "Name= " + name +
                ", age=" + age +
                ", isMan=" + isMan;
    }

    //Getter for name

    public int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}



