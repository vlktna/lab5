/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Выводит элементы коллекции
 */

package collection.commands;

import collection.WorkerCollection;

public class Show {

    private WorkerCollection workers;

    public Show(WorkerCollection workers){
        this.workers = workers;
    }

    public void show(){
        if(this.workers.getCollection().size() != 0) {
            System.out.println(this.workers.getCollection());
        }
        else{
            System.out.println("Коллекция пуста");
        }
    }
}
