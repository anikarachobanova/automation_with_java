public class Student {

    //Създайте клас Student, описващ студент. Класът да има следните полета:
    //name – име на студента
    //subject - специалност
    //grade - успех
    //yearInCollege – курс
    //age – години на студента
    //isDegree – дали е завършил или не
    //money – пари от стипендии

    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;


    //Класът да дефинира следните конструктори:
    //конструктор по подразбиране който задава следните стойностите на полетата: grade = 4.0, yearInCollege = 1, isDegree = false, money = 0
    //констуктор с параметри които извиква конструктора по подразбиране и инициализира(задава първоначални стойности) останалите полета на класа

    //Constructors
    Student() {
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;
    }

    Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }


    //Add new constructor with grade and yearInCollege fields and passing params in order to achieve students with different grades.
    Student (String name,String subject,double grade,int yearInCollege,int age){
        this(name, subject, age);
        this.grade = grade;
        this.yearInCollege = yearInCollege;
    }


    //Класът да дефинира следните методи:
    //метод void upYear() който увеличава годината в колежа с единица, ако студента не е завършил, в противен случай извежда подходящо съобщение.
    //Ако след увеличаването годината стане 4, задава true на полето isDegree.
    //метод double receiveScholarship(double min, double amount) – добавя сумата amount кум парите на студента, само ако успеха му е по-висок или равен
    //на минималния успех подаден като параметър (min) и ако възрастта му е под 30 години.
    //Метода връща текущите пари на студента (след евентуалното им увеличение)

    //Methods
    void upYear() {
        if (!this.isDegree) {
            this.yearInCollege++;
            if (this.yearInCollege >= 4) {
                this.isDegree = true;
                System.out.println(this.name + " has graduated");
            } else {
                System.out.println(this.name + " is now in year " + this.yearInCollege + "of college");
            }
        } else {
            System.out.println(this.name + " has already graduated");
        }


    }

    double receiveScholarship(double min, double amount) {
        if (this.grade >= min && this.age < 30) {
            this.money = money + amount;
            System.out.println(this.name + " has received a scholarship of " + amount + ".");
        } else {
            System.out.println(this.name + " does not qualify for the scholarship.");
        }
        return this.money;

    }

}
