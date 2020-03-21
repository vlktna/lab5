/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Сохраняет коллекцию в файл
 */
package collection.commands;

import collection.WorkerCollection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class Save {
    private WorkerCollection workers;
    public Save(WorkerCollection workers){
        this.workers = workers;
    }

    /**
     * @throws IOException
     */
    public void save(String fileName) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
        out.print(gson.toJson(this.workers.getCollection()));
        out.close();
        System.out.println("Коллекция сохранена");
    }
}
