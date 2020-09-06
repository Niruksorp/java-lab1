import Entity.Car;
import Obertka.TransortCollection;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        TransortCollection collection = new TransortCollection();

        Car de = new Car(1, "eq");

        while (loop){
            printMenu();
            System.out.println("Введите команду! \n");
            switch (input.nextInt()) {
                case 0: {
                    collection.addToList(de);
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
                default:
            }
        }

    }

    public static void printMenu () {
        String menu = "1. Добавить элемент в список (TransortCollection). \n"
                + "2. Удалить э-т из списка(TransortCollection). \n"
                + "3. Вывод всей коллекции (TransortCollection) (toString) \n"
                + "4. Сравнение 2 эл-тов (pos 1, pos 2)\n"
                + "5. Выход из программы";
        System.out.println(menu);
    }

    enum caseVariable {
        FIRST_TYPE
        ,SECOND_TYPE
        ,FIRTH_TYPE;
    }

}
