public class StudentGroup {
    //Да се създаде и клас StudentGroup, репрезентиращ група от студенти от една и съща специалност.
    //Полета на класа:
    //groupSubject – специалност на студентите в групата
    //Student[] students – Студенти в групата(масив от обекти от клас Student)
    //freePlaces – свободни места в групата

    String groupSubject;
    Student[] students;
    int freePlaces;

    //Constructors
    //конструктор по подразбиране който създава места за 5 студента в групата
    //(инициализира полето students с нов масив от 5 елемента) и задава стойност 5 на полето freePlaces
    //констуктор StudentGroup(String subject) които първо извиква конструктора по подразбиране и задава стойност на полето groupSubject.

    StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;

    }

//Methods
//метод void addStudent(Student s) който добавя студент към групата(добавя го към масива на следващата празна позиция) ако специалността на
//студента съвпада с тази на групата, и разбира се, ако има свободни места. След добавяне на студент към групата да се намалят свободните места в групата.

    void addStudent(Student student) {
        if (this.freePlaces > 0) {
            if (student.subject.equals(this.groupSubject)) {
                for (int i = 0; i < this.students.length; i++) {
                    if (this.students[i] == null) {
                        this.students[i] = student;
                        this.freePlaces--;
                        System.out.println(student.name + " added to the group");
                        return;

                    }
                }

            } else {
                System.out.println("Student " + student.name + " does not match the group subject");
            }

        } else {
            System.out.println("No free places available in the group");
        }
    }

    //метод void emptyGroup() който освобождава всички места в групата (задава нов празен масив за полето students)
    //и задава стойност 5 за полето freePlaces.
    void emptyGroup() {
        this.students = new Student[5]; //Resets to a new empty array
        this.freePlaces = 5;
        System.out.println("The group has been emptied");
    }

    // Метод theBestStudent() - Връща името на студента с най-висок успех в групата
    String theBestStudent() {
        Student bestStudent = null;
        for (int i = 0; i < this.students.length; i++) {
            Student student = this.students[i];
            if (student != null && (bestStudent == null || student.grade > bestStudent.grade)) {
                bestStudent = student;
            }
        }

        if (bestStudent != null) {
            System.out.println("The best student in this group " + this.groupSubject + " is " + bestStudent.name);
            return bestStudent.name;
        } else {
            return "No students in this group";
        }
    }


    //метод printStudentsInGroup() - Изкарва информация (Име, успех, ...)за всички студент в курса.
    void printStudentsInGroup() {
        System.out.println("Students in group " + this.groupSubject + ":");
        for (int i = 0; i < this.students.length; i++) {
            Student student = this.students[i]; // Access student at index i
            if (student != null) { // Check if the current student is not null
                System.out.println("Name: " + student.name + ", Grade: " + student.grade +
                        ", Year: " + student.yearInCollege + ", Age: " + student.age +
                        ", Money: " + student.money);
            }
        }
    }




}



