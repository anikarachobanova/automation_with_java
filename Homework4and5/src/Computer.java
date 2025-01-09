public class Computer {

    //Създайте клас Computer, който представя компютър.
    //Класът да има следните полета:
    //year – числова стойност показваща година на производство на компютъра
    //price – числова стойност (не е задължително да е цяло число) показваща цената на компютъра
    //isNotebook – булева стойност – дали компютъра е преносим или не
    //hardDiskMemory – числова стойност за размера на хардиска
    //freeMemory – числова стойност показваща размера на свободната памет
    //operationSystem – текстово поле за операционната система на компютъра

    //Допълнете задачата от предишното домашно със следните неща:
    //Класът Computer да има следните конструктори:
    //конструктор по подразбиране Computer() който инициализира полето isNotebook със стойност false, и полето operationSystem с „Win XP“.
    //констуктор с параметри Computer(int year, double price, double hardDiskMemory, double freeMemory),
    //който първо извиква конструктора по подразбиране и после инициализира останалите полета със стойностите подадени като аргументи.
    //конструктор с параметри Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem),
    //който инициализира всички полета със стойностите подадени като аргументи на конструктора.


    //Fields
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    //Constructor

    //Default constructor
    Computer() {
        this.isNotebook = false;
        this.operationSystem = "Win XP";
    }

    //Constructor1 with params
    Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    //Constructor2 with params
    Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this(year, price, hardDiskMemory, freeMemory);
        this.operationSystem = operationSystem;
    }

//метод void changeOperationSystem(String newOperationSystem), който сменя стойността на полето operationSystem със стойността подадена като параметър.
//метод void useMemory(double memory), който намалява свободната памет (freeMemory) със стойността подадена като аргумент.
//Ако стойността на аргумента е по-голяма от свободната памет, извеждa съобщение "Not enough free memory!"

//метод int comparePrice(Computer otherComp), който сравнява цените на 2 компютъра.
//Ако цената на първия компютър (този, за който се вика метода) е по висока от тази на компютъра подаден като аргумент, метода връща -1.
//Ако цената на компютъра подаден като аргумент е по-високата, се връща 1, а ако са равни, метода връща стойност 0.

    //Methods
    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
    }

    void useMemory(double memory) {
        if (memory > freeMemory)
            System.out.println("Not enough free memory");

        else {
            freeMemory = freeMemory - memory;
        }
    }

    int comparePrice(Computer otherComp) {
        if (this.price > otherComp.price) {
            return -1;
        } else if (otherComp.price > this.price) {
            return 1;
        } else if (this.price == otherComp.price) {
        }

        return 0;
    }


}
