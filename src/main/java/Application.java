import Entity.Car;
import Entity.Plane;
import Entity.Ship;
import Entity.Vehicle;
import Obertka.TransortCollection;
import Obertka.TransportList;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        TransportList collection = new TransortCollection();

        collection.addToList(new Car(2020,"X7",2,"Mazda"));
        collection.addToList(new Ship(2020,"X7",2,"Mazda"));
        collection.addToList(new Plane(2020,"X7",2,"Mazda"));

        while (loop){
            printMenu();
            System.out.println("Введите команду! \n");
            switch (input.nextInt()) {
                case 0: {
                    collection.addToList(generateEx(input));
                    break;
                }
                case 1: {
                    collection.deleteElement(0);
                    break;
                }
                case 2: {
                    System.out.println(collection.toString());;
                    break;
                }
                case 3: {
                    System.out.println();
                    break;
                }
                case 4: {
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
        System.out.println("Введите год выпуска:");
        int year = scanner.nextInt();
        System.out.println("Введите название ");
        String name = scanner.next();
        System.out.println("Введите что то там ");
        int mil = scanner.nextInt();
        System.out.println("Введите что то там ");
        String mark = scanner.next();
        return new Car(year, name, mil, mark);
    }


}
