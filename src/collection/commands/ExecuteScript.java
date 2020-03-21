/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Выполняет скрипт
 */

package collection.commands;

import collection.CommandList;
import collection.WorkerCollection;
import input.FileRead;

import java.io.File;
import java.io.IOException;

public class ExecuteScript {

    private WorkerCollection workers;

    public ExecuteScript(WorkerCollection workers){
        this.workers = workers;
    }

    /**
     * @param fileName - файл, в котором хранится скрипт
     * @throws StackOverflowError
     * @throws IOException
     */
    public void execute_script(String fileName) throws StackOverflowError, IOException {
        try {

            File file = new File(fileName);
            if(file.exists()){
                FileRead script = new FileRead();
                script.FileInput(fileName);
                CommandList choice = new CommandList(this.workers);
                while (!script.getNextInput().equals("exit")) {
                    choice.commandChoice(script);
                }
            }
            else{
                System.out.println("Файл не найден");
            }

        }catch (StackOverflowError e){
            System.out.println("Дорекурсился");
        }
    }
}
