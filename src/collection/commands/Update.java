/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Обновляет значение элемента коллекции, id которого равен заданному
 */

package collection.commands;

import aboutWorker.Worker;
import collection.WorkerCollection;
import input.IOInterface;

public class Update {

    private WorkerCollection workers;
    public Update(WorkerCollection workers){
        this.workers = workers;
    }

    /**
     * @param ID - заданный ID
     * @param ioInterface - интерфейс для считывания данных
     * @throws NumberFormatException
     */
    public void update(String ID, IOInterface ioInterface) throws NumberFormatException{
        int id = Integer.parseInt(ID);
        int counter = 0;
        for (int i = 0; i < this.workers.getCollection().size(); i++) {
            if (this.workers.getCollection().get(i).getId() == id) {
                ReadElement read = new ReadElement();
                Worker worker = read.readElement(ioInterface);
                this.workers.getCollection().remove(i);
                this.workers.getCollection().add(worker);
                System.out.println("Элемент коллекции обновлен");
            }
            else {
                counter += 1;
            }
        }
        if (counter == this.workers.getCollection().size()){
            System.out.println("Такой элемент не найден");
        }
    }
}
