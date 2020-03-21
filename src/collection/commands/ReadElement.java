/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Считывает элемент коллекции
 */

package collection.commands;

import aboutWorker.*;
import input.IOInterface;

import java.util.InputMismatchException;

public class ReadElement {
    /**
     * @param ioInterface - интерфейс для считывания данных
     * @return worker - новый элемент коллекции
     * @throws InputMismatchException
     * @throws NumberFormatException
     */
    public Worker readElement(IOInterface ioInterface) throws InputMismatchException, NumberFormatException{
        Worker worker;

        /** Имя работника*/
        String name;
        do {
            System.out.println("Введите имя:");
            name = ioInterface.getNextInput().trim();
        } while (name.equals(""));

        /** Координата x */
        int x = 0;
        do {
            System.out.println("Введите координаты, x:");
            try {
                x = ioInterface.getNextIntInput();
            }catch (InputMismatchException e){
                System.out.println("Введи целое число от -2147483648 до 2147483647");
            }
        } while (x == 0);

        /** Координата y */
        Integer y = null;
        String y1;
        do {
            System.out.println("y:");
            try {
                y1 = ioInterface.getNextInput();
                y = Integer.parseInt(y1);
            } catch (NumberFormatException | NullPointerException e){
                System.out.println("Введи целое число от -2147483648 до 2147483647");
            }

        } while (y == null);

        /** Зарплата работника x */
        Long salary = 0L;
        do {
            System.out.println("Введите размер зарплаты (целое положительное число):");
            try{
                salary = ioInterface.getNextLongInput();
            }
            catch (InputMismatchException e){
                System.out.println("Введите целое число от 1 до 9223372036854775807");
            }

        } while (salary <= 0L);

        /** Должность работника */
        String position1;
        Position position = null;
        do {
            System.out.println("Выберите должность: LABORER (1), ENGINEER (2), HEAD_OF_DEPARTMENT (3), DEVELOPER (4), BAKER (5)");
            position1 = ioInterface.getNextInput().trim().toLowerCase();
            switch (position1) {
                case "laborer":
                case "1":
                    position = Position.LABORER;
                    break;

                case "engineer":
                case "2":
                    position = Position.ENGINEER;
                    break;

                case "head_of_department":
                case "head of department":
                case "3":
                    position = Position.HEAD_OF_DEPARTMENT;
                    break;

                case "developer":
                case "4":
                    position = Position.DEVELOPER;
                    break;

                case "baker":
                case "5":
                    position = Position.BAKER;
                    break;

                default:
                    System.out.println("Такой должности нет");
                    break;
            }
        } while(position == null);

        /** Тип компании */
        String organizationType1;
        OrganizationType organizationType = null;
        do {
            System.out.println("Выберите тип организации: COMMERCIAL (1), PRIVATE_LIMITED_COMPANY (2), OPEN_JOINT_STOCK_COMPANY (3)");
            organizationType1 = ioInterface.getNextInput().trim().toLowerCase();
            switch (organizationType1) {
                case "commercial":
                case "1":
                    organizationType = OrganizationType.COMMERCIAL;
                    break;

                case "private_limited_company":
                case "private limited company":
                case "2":
                    organizationType = OrganizationType.PRIVATE_LIMITED_COMPANY;
                    break;

                case "open_joint_stock_company":
                case "open joint stock company":
                case "3":
                    organizationType = OrganizationType.OPEN_JOINT_STOCK_COMPANY;
                    break;

                default:
                    System.out.println("Такого варианта нет");
                    break;
            }
        } while(organizationType == null);

        /** Количество работников в компании */
        Integer employeesCount = 0;
        do {
            System.out.println("Введите количество работников в компании");
            try{
                employeesCount = ioInterface.getNextIntInput();
            }
            catch (InputMismatchException e){
                System.out.println("Введи целое число от 1 до 2147483647");
            }
        } while (employeesCount <= 0);

        worker = new Worker(name, new Coordinates(x, y), salary, position, new Organization(employeesCount, organizationType));
        return worker;
    }
}
