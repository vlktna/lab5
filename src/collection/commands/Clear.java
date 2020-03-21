/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Очищает коллекцию
 */
package collection.commands;

import collection.WorkerCollection;

public class Clear {

    private WorkerCollection workers;
    public Clear(WorkerCollection workers){
        this.workers = workers;
    }

    public void clear(){
        this.workers.getCollection().clear();
        System.out.println("Коллекция очищена");
    }
}
