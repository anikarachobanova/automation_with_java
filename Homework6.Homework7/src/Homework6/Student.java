package Homework6;

public class Student extends Person {
    //Класът Homework6.Student наследяващ Homework6.Person, репрезентиращ ученик да има
    //Полета:
    //score - показва оценката на ученика (число между 2 и 6, не е задължително да е цяло)
    //Единствен конструктор:
    //Homework6.Student(String name, int age, boolean isMan, double score) задаващ стойности и на наследените полета
    //Метод showStudentInfo() който показва информация за човека и информация за оценката му (чрез надписи на екрана)
    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    void showStudentInfo() {
        super.showPersonInfo();
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", Homework6.Student score : " + this.score;
    }
}

