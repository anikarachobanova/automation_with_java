public class ComputerDemo {
    //Да се създаде клас ComputerDemo, с main метод.
    //В рамките на main метода да се създадат 2 обекта от тип Computer.
    //Да се зададат стойности на всеки от компютрите за year, price,hardDiskMemory, freeMemory, operationSystem.
    //Нека единият компютър да е лаптоп.
    //На единия от двата компютъра да се задели памет 100 (чрез метода useMemory),
    //а на другия, да се смени операционната система (чрез метода changeOperationSystem),
    //след което да се изведат на екрана всичките полета на двата компютъра.

    public static void main(String[] args) {
        //Computer HP fields
        Computer hp = new Computer();
        hp.year = 2020;
        hp.price = 2876.99;
        hp.hardDiskMemory = 512;
        hp.freeMemory = 400;
        hp.operationSystem = "Windows 10";
        hp.isNotebook = true;
        //Call method useMemory
        hp.useMemory(100);

        //Computer Siemens fields:
        Computer siemens = new Computer();
        siemens.year = 2023;
        siemens.price = 3200.60;
        siemens.hardDiskMemory = 1024;
        siemens.freeMemory = 750;
        siemens.operationSystem = "Linux";
        //Call method changeOperationSystem
        siemens.changeOperationSystem("Windows 11");


        //Print all fields of HP
        System.out.println("Year of production HP: " + hp.year);
        System.out.println("Price of HP: " + hp.price);
        System.out.println("Hard disk memory of HP: " + hp.hardDiskMemory);
        System.out.println("Free memory of HP: " + hp.freeMemory);
        System.out.println("Operation system of HP: " + hp.operationSystem);
        System.out.println("Is HP notebook: " + hp.isNotebook);

        //Print all fields of Siemens
        System.out.println("Year of production Siemens: " + siemens.year);
        System.out.println("Price of Siemens: " + siemens.price);
        System.out.println("Hard disk memory of Siemens: " + siemens.hardDiskMemory);
        System.out.println("Free memory of Siemens: " + siemens.freeMemory);
        System.out.println("Operation system of Siemens: " + siemens.operationSystem);
        System.out.println("Is Siemens notebook: " + siemens.isNotebook);

    }
}
