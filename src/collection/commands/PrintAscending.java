/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Сортирует коллекцию в порядке возратсания ID
 */

package collection.commands;

import aboutWorker.Worker;
import collection.WorkerCollection;

import java.util.Comparator;


public class PrintAscending {

    private WorkerCollection workers;
    public PrintAscending(WorkerCollection workers){
        this.workers = workers;
    }

    public void print_ascending(){
        Comparator<Worker> comparator = Comparator.comparing(Worker::getId);
        this.workers.getCollection().sort(comparator);
        System.out.println("Коллекция отсортирована по возрастанию ID");
    }
}
