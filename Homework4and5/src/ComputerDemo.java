public class ComputerDemo {
    public static void main(String[] args) {

        //В рамките на main метода да се създадат няколко обекта от тип Computer (посредством някой от наличните конструктори).
        //Да се сравнят цените на някои от компютрите (посредством метода comparePrice) и да се изведе подходящо съобщение.

        Computer samsung = new Computer(2020, 2100, 25.3, 500);
        Computer intel = new Computer(2022, 2500, true, 50, 600, "Win 11");
        Computer hp = new Computer(2023, 3000, true, 70.0, 750, "Win 10");
        Computer siemens = new Computer(2022, 2100, 70, 800);

        int comparePrice = samsung.comparePrice(hp);
        if (comparePrice == -1) {
            System.out.println("samsung is more expensive than hp");
        } else if (comparePrice == 1) {
            System.out.println("samsung is NOT more expensive than hp");
        } else {
            System.out.println("samsung and hp have the same price");
        }

        int comparePrice2 = intel.comparePrice(siemens);
        if (comparePrice2 == -1) {
            System.out.println("intel is more expensive than siemens");
        } else if (comparePrice2 == 1) {
            System.out.println("intel is NOT more expensive than siemens");
        } else {
            System.out.println("intel and siemens have the same price");
        }


        int comparePrice3 = samsung.comparePrice(siemens);
        if (comparePrice3 == -1) {
            System.out.println("samsung is more expensive than siemens");
        } else if (comparePrice3 == 1) {
            System.out.println("samsung is NOT more expensive than siemens");
        } else {
            System.out.println("samsung and siemens have the same price");
        }

    }
}


