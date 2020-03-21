/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Главный класс
 */


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import collection.WorkerCollection;
import input.TerminalRead;

public class Main {
    /**
     * @throws IOException
     * @throws NoSuchElementException
     */
    public static void main(String[] args) throws IOException, NoSuchElementException {

        TerminalRead terminal = new TerminalRead();
        WorkerCollection workers = new WorkerCollection();

        /**
         * Если пользователь не ввел название файла, то он создается автоматически
         */
        if (args.length > 0){
            String fileName = args[0];
            workers.createCollection(fileName);
            System.out.println("Коллекция успешно загружена");
        }
        else{
            try
            {
                PrintWriter out = new PrintWriter(new File("newFile.json").getAbsoluteFile());
                out.print("[]");
                out.close();
                workers.createCollection("newFile.json");

            } catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        try {
            System.out.println("Напиши help, чтобы увидеть список доступных команд");
            App a = new App(terminal);
            a.app(workers);
        } catch (NoSuchElementException e) {
            System.out.println("Так не честно...");
        }
    }
}
