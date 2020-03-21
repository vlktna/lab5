/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Удаляет из коллекции все элементы, ID которых меньшие, чем заданный
 */

package collection.commands;

import collection.WorkerCollection;
import exceptions.NoArgumentException;

public class RemoveLower {

    private WorkerCollection workers;
    public RemoveLower(WorkerCollection workers){
        this.workers = workers;
    }

    /**
     * @param id - заданный ID
     * @throws NoArgumentException
     * @throws NumberFormatException
     */
    public void remove_lower(String id) throws NoArgumentException, NumberFormatException{
        int ID = Integer.parseInt(id);
        int counter = 0;
        for (int i = 0; i < this.workers.getCollection().size(); i++) {
            if (this.workers.getCollection().get(i).getId() < ID) {
                System.out.println("Элемент c ID = " + this.workers.getCollection().get(i).getId() + " удален");
                this.workers.getCollection().remove(i);
            }
            else{
                counter += 1;
            }
        }
        if (counter == this.workers.getCollection().size()){
            System.out.println("Такие элементы не найдены");
        }
    }
}
