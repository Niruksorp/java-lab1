import Entity.Car;
import Entity.Plane;
import Entity.Ship;
import Entity.Vehicle;
import Structure.TransportCollection;
import Structure.TransportList;

import java.util.Scanner;
import java.util.function.Predicate;

public class Application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        TransportList collection = new TransportCollection();

        collection.addToList(new Car(2020,"X7",2,"Mazda"));
        collection.addToList(new Ship(2020,"X7",2,"Mazda"));
        collection.addToList(new Plane(2020,"X7",2,"Mazda"));

        while (loop){

            printMenu();
            System.out.println("Введите команду! \n");
            switch (getInt(input)) {
                case 1: {
                    collection.addToList(generateEx(input));
                    break;
                }
                case 2: {
                    collection.deleteElement(getInt(input));
                    break;
                }
                case 3: {
                    System.out.println(collection.toString());;
                    break;
                }
                case 4: {
                    System.out.print(collection.equals(getInt(input),getInt(input)));
                    break;
                }
                case 5: {
                    loop  = false;
                    return;
                }
                default: System.out.println("Неправильно введено значение\n");
            }
        }

    }

    public static void printMenu () {
        String menu = "1. Добавить элемент в список (TransportCollection). \n"
                + "2. Удалить э-т из списка(TransportCollection). \n"
                + "3. Вывод всей коллекции (TransportCollection) (toString) \n"
                + "4. Сравнение 2 эл-тов (pos 1, pos 2)\n"
                + "5. Выход из программы";
        System.out.println(menu);
    }

    public static Vehicle generateEx(final Scanner scanner) {
        System.out.println("Введите год выпуска(2000 - 2020):");
        int year = selectCorrectNum(scanner);
        System.out.println("Введите название: ");
        String name = scanner.next();
        System.out.println("Введите пробег машины: ");
        int mil = selectCorrectNum(scanner);
        System.out.println("Введите название марки: ");
        String mark = scanner.next();
        return new Car(year, name, mil, mark);
    }

    public static int getInt(final Scanner scanner) {
        System.out.println("Введити число");
        boolean flag = false;
        while (!flag) {
            if (scanner.hasNextInt()) return scanner.nextInt();
            scanner.next();
            System.out.println("Введите значение");
        }
        return -1;
    }

    public static int selectCorrectNum (final Scanner scanner) {
        Predicate<Integer> isPositive = x -> (x < 2020 & x > 2000  );
        int mil = scanner.nextInt();
        while (!isPositive.test(mil)) {
            System.out.println("Неправильное значение. Ожидается 2000 - 2020 ");
            mil = getInt(scanner);
        }
        return mil;
    }
}
