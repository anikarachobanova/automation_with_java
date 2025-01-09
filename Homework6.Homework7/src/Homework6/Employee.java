package Homework6;

public class Employee extends Person{
    //Класът Homework6.Employee да наследява Homework6.Person и да дефинира:
    //поле - daySalary показва дневната заплата на работника
    //Конструктор, който инициализира всичките му полета (собствени и наследени)
    //Методи:
    //В случай че на работник се наложи да работи извън работно време, на него му се дължи допълнителна сума пари (overtime) за часовете
    //които е работил. Сумата се пресмята по следния начин: ако работника, няма навършени 18 години, дължимата сума е 0. В противен случай, за всеки
    //отработен час, на работника се заплаща сумата която получава на час (зависи от дневната заплата) умножена по 1,5.
    //метод calculateOvertime(double hours) който пресмята и връща стойността на сумата която му се дължи при работа извън работно време
    //метод showEmployeeInfo(), който показва информация за човека, както и информация за дневната му заплата

    double daySalary;

    public Employee(String name, int age, boolean isMan,int daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    //Methods
    double calculateOvertime(double hours){
        if (this.getAge() < 18){
            return 0;
        }

        else return (daySalary / 8) * 1.5 * hours;
    }
    void showEmployeeInfo(){
        super.showPersonInfo();
    }

    @Override
    public String toString() {
        return super.toString() +", Day salary is " +this.daySalary;
    }


}

