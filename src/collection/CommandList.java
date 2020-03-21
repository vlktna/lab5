/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Получает комманду из CommandReader и вызывает нужные методы
 */

package collection;

import collection.commands.*;
import exceptions.NoArgumentException;
import input.IOInterface;

import java.io.IOException;
import java.util.LinkedList;

public class CommandList {

    private WorkerCollection workers;

    public CommandList(WorkerCollection workers) {
        this.workers = workers;
    }

    /** Коллекция для хранения введенных команд */
    LinkedList<String> historyList = new LinkedList<>();

    /**
     * @param inputCommand - команда для выполнения
     * @throws IOException
     */
    public void commandChoice(IOInterface inputCommand) throws IOException, NullPointerException {

            CommandReader reader = new CommandReader();
            String[] line = reader.returnCommand(inputCommand);

    switch (line[0]) {
        case "help":
            Help command1 = new Help();
            command1.help();
            this.historyList.add("help");
            break;

        case "info":
            Info command2 = new Info(workers);
            command2.info();
            this.historyList.add("info");
            break;

        case "show":
            Show command3 = new Show(workers);
            command3.show();
            this.historyList.add("show");
            break;

        case "add":
            Add command4 = new Add(workers);
            command4.add(inputCommand);
            this.historyList.add("add");
            break;

        case "update":
            try {
                if (line.length < 2) throw new NoArgumentException("Не введено значение ID");
                Update command5 = new Update(workers);
                command5.update(line[1], inputCommand);
                this.historyList.add("update");
            } catch (NoArgumentException e) {
                e.getMessage();
            } catch (NumberFormatException e) {
                System.out.println("Введи значение ID");
            }
            break;

        case "remove_by_id":
            try {
                if (line.length < 2) throw new NoArgumentException("Не введено значение ID");
                RemoveById command6 = new RemoveById(workers);
                command6.remove_by_id(line[1]);
                this.historyList.add("remove_by_id");
            } catch (NoArgumentException e) {
                e.getMessage();
            } catch (NumberFormatException e) {
                System.out.println("Введи значение ID");
            }
            break;

        case "clear":
            Clear command7 = new Clear(workers);
            command7.clear();
            this.historyList.add("clear");
            break;

        case "save":
            try {
                if (line.length < 2) throw new NoArgumentException("Не введено имя файла");
                Save command8 = new Save(workers);
                command8.save(line[1]);
                this.historyList.add("save");
            } catch (NoArgumentException e) {
                System.out.println("Введите имя файла");
            }
            break;

        case "execute_script":
            try {
                if (line.length < 2) throw new NoArgumentException("Не введен путь к файлу");
                ExecuteScript command9 = new ExecuteScript(workers);
                command9.execute_script(line[1]);
                this.historyList.add("execute_script");
            } catch (NoArgumentException | IOException e) {
                e.getMessage();
            }

            break;

        case "add_if_max":
            AddIfMax command10 = new AddIfMax(workers);
            command10.add_if_max(inputCommand);
            this.historyList.add("add_if_max");
            break;

        case "remove_lower":
            try {
                if (line.length < 2) throw new NoArgumentException("Не введено значение ID");
                RemoveLower command11 = new RemoveLower(workers);
                command11.remove_lower(line[1]);
                this.historyList.add("remove_lower");
            } catch (NoArgumentException e) {
                e.getMessage();
            } catch (NumberFormatException e) {
                System.out.println("Введи значение ID");
            }
            break;

        case "history":
            if (this.historyList.size() > 10) {
                for (int i = 0; i < this.historyList.size() - 11; i++) {
                    this.historyList.remove(i);
                }
            }
            System.out.println(this.historyList);
            this.historyList.add("history");
            break;

        case "filter_by_position":
            try {
                if (line.length < 2) throw new NoArgumentException("Не введено значение должности");
                FilterByPosition command12 = new FilterByPosition(workers);
                command12.filter_by_position(line[1]);
                this.historyList.add("filter_by_position");

            } catch (NoArgumentException e) {
                e.getMessage();
            } catch (IllegalArgumentException e) {
                System.out.println("Такой должности нет");
            }
            break;

        case "print_ascending":
            PrintAscending command13 = new PrintAscending(workers);
            command13.print_ascending();
            this.historyList.add("print_ascending");
            break;

        case "print_field_descending_start_date":
            PrintFieldDescendingStartDate command14 = new PrintFieldDescendingStartDate(workers);
            command14.print_field_descending_start_date();
            this.historyList.add("print_field_descending_start_date");
            break;

        default:
            System.out.println("Данная команда не найдена, напишите help для справки");
            break;
    }

}

}
