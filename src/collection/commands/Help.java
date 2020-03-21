/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Информация по всем доступым командам
 */
package collection.commands;

public class Help {

    public void help() {
        System.out.println("help: вывести справку по доступным командам " +
                "\ninfo: вывести информацию о коллекции " +
                "\nshow: вывести все элементы коллекции в строковом представлении " +
                "\nadd: добавить новый элемент в коллекцию " +
                "\nupdate {id}: обновить значение элемента коллекции, id которого равен заданному " +
                "\nremove_by_id {id}: удалить элемент из коллекции по его id " +
                "\nclear: очистить коллекцию " +
                "\nsave {file name}: сохранить коллекцию в файл " +
                "\nexecute_script {file name}: считать и исполнить скрипт из указанного файла " +
                "\nexit: завершить программу (без сохранения в файл) " +
                "\nadd_if_max: добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции " +
                "\nremove_lower {id}: удалить из коллекции все элементы, меньшие, чем заданный " +
                "\nhistory: вывести последние 11 команд (без их аргументов) " +
                "\nfilter_by_position {position}: вывести элементы, значение поля position которых равно заданному (LABORER, ENGINEER, HEAD_OF_DEPARTMENT, DEVELOPER, BAKER)" +
                "\nprint_ascending: вывести элементы коллекции в порядке возрастания " +
                "\nprint_field_descending_start_date: вывести значения поля startDate в порядке убывания");
    }

}
