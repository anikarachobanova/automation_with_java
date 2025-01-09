package Homework11;

//Създайте клас репрезентиращ човек
//Всеки човек има: име, години, ръст, тегло
//Имате единствен конструктор, който сет-ва всичките параметри наведнъж
//Имате getters & setters за всичките полета
//Имплементирайте така класа, че ако има някви неща от полетата, които НЕ е редно да приемат отрицателни стойности да си мрънкат със свой собтвен exception навсякъде, където може да бъде set-вана стойност на тях.
//Направете Demo клас, в който си инстанциирайте един човек от този клас, и му извикайте въпросните методи/конструктор и обработете евенуални exceptional събития ако настъпват.




public class Person {
    private String name;
    private int age;           // Age in years, should be non-negative
    private double height;      // Height in centimeters, should be non-negative
    private double weight;      // Weight in kilograms, should be non-negative

    // Constructor that sets all fields and checks for invalid values
    public Person(String name, int age, double height, double weight) throws InvalidValueExceptionAge,InvalidValueExceptionHeight,InvalidValueExceptionWeight {
        this.name = name;
        if (age < 18) {
            throw new InvalidValueExceptionAge("Person age cannot be under 18");
        }
        this.age = age;
        if (height < 150){
            throw new InvalidValueExceptionHeight("Person height cannot be under 150 centimeters");
        }
        this.height = height;
        if (weight < 20){
            throw new InvalidValueExceptionWeight("Person weight cannot be under 20 kilos");
        }
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidValueExceptionAge {
        if (age < 18) {
            throw new InvalidValueExceptionAge("Person age cannot be under 18");
        }
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws InvalidValueExceptionHeight {
        if (height < 150) {
            throw new InvalidValueExceptionHeight("Height cannot be under 150 centimeters");
        }
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws InvalidValueExceptionWeight {
        if (weight < 20){
            throw new InvalidValueExceptionWeight("Weight cannot be under 20 kilos.");
        }
        this.weight = weight;
    }


    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", height=" + height + ", weight=" + weight + "}";
    }
}
