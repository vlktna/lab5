/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Удаляет элемент коллекции по заданному ID
 */
package collection.commands;

import collection.WorkerCollection;

import static java.lang.Integer.decode;

public class RemoveById {

    private WorkerCollection workers;

    public RemoveById(WorkerCollection workers){
        this.workers = workers;
    }

    /**
     * @param ID - ID удаляемого элемента
     * @throws NumberFormatException
     */
    public void remove_by_id(String ID) throws NumberFormatException{
        Integer id = decode(ID);
        int counter = 0;
        int counter1 = this.workers.getCollection().size();
        for (int i = 0; i < this.workers.getCollection().size(); i++){
            if(this.workers.getCollection().get(i).getId().equals(id)){
                this.workers.getCollection().remove(i);
                System.out.println("Элемент удален");
                counter1 += 1;
            }
            else {
                counter += 1;
            }
        }

        if (counter == counter1 ){
            System.out.println("Элемент с таким ID не найден");
        }
    }
}
