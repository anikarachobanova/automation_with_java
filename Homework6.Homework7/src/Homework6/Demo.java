package Homework6;

public class Demo {
    public static void main(String[] args) {
        //Да се напише и демонстративен клас с main метод в който:
        //Да се състави масив от 10 елемента от тип Homework6.Person.
        //Да се създадът по два обекта от тип Homework6.Person, Homework6.Student и Homework6.Employee и да се вкарат в масива от хора.
        //Да се обходим масива и в зависимост от това дали обекта е от тип Homework6.Person, Homework6.Student или Homework6.Employee да се извика съответно метода
        //showPersonInfo, showStudentInfo или showEmployeeInfo.
        //Да се обходи още веднъж масива с хора и за всеки човек, който е работник, да се изведе на екрана сумата, която му се дължи при 2 часа работа извън работно време.

        Person[] people = new Person[10]; //Array with 10 indexes
        //Create objects
        people[0] = new Person("Ani", 31, false);
        people[1] = new Person("Nikola", 38, true);
        people[2] = new Student("Elena", 24, false, 5);
        people[3] = new Student("Ivan", 25, true, 4);
        people[4] = new Employee("Mitko", 29, true, 120);
        people[5] = new Employee("Katia", 27, false, 150);

        //Show info according to its object type

        for (int i = 0; i < people.length; i++) {
            if (i == 0 || i == 1) {
                people[i].showPersonInfo();
            } else if (i == 2 || i == 3) {
                ((Student) people[i]).showStudentInfo();
            } else if (i == 4 || i == 5) {
                ((Employee) people[i]).showEmployeeInfo();
            }
        }
        for (int i=0;i < people.length; i++){
            if (i==4 || i==5){
                Employee employee = (Employee) people[i];
                System.out.println("Overtime calculated for 2 hours for "+employee.getName()+" is "+employee.calculateOvertime(2));
            }

        }


    }


}
