/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Выводит справку по коллекции
 */

package collection.commands;
import collection.WorkerCollection;

public class Info {

    private WorkerCollection workers;

    public Info(WorkerCollection workers){
        this.workers = workers;
    }

    public void info(){
        System.out.println(this.workers.toString());
    }
}
