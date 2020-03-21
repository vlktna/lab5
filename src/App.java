/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Осуществляет рекурсивный ввод команд
 */


import collection.CommandList;
import collection.WorkerCollection;
import input.TerminalRead;
import java.io.IOException;
import java.util.NoSuchElementException;

public class App {

    private TerminalRead terminal;

    public App(TerminalRead terminal) {
        this.terminal = terminal;
    }

    /**
     * @param workers - класс, в котором хранится коллекция
     * @throws IOException
     * @throws NoSuchElementException
     */
    public void app(WorkerCollection workers) throws IOException, NoSuchElementException {
        CommandList choice = new CommandList(workers);
        while (!this.terminal.getNextInput().equals("exit")) {
            choice.commandChoice(this.terminal);
        }
    }
}


