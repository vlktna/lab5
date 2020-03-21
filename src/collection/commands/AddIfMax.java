/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Добавляет новый элемент в коллекцию, если его ID превышает значение наибольшего элемента этой коллекции
 */


package collection.commands;

import aboutWorker.Worker;
import collection.WorkerCollection;
import input.IOInterface;


public class AddIfMax {

    private WorkerCollection workers;

    public AddIfMax(WorkerCollection workers){
        this.workers = workers;
    }

    /**
     * @param ioInterface - интерфейс для считывания данных
     * @throws NumberFormatException
     */
    public void add_if_max(IOInterface ioInterface) throws NumberFormatException{
        int maxId = -1;
        for (int i = 0; i < this.workers.getCollection().size(); i++){
            if (this.workers.getCollection().get(i).getId() > maxId){
                maxId = this.workers.getCollection().get(i).getId();
            }
        }
        ReadElement newElement = new ReadElement();
        Worker worker = newElement.readElement(ioInterface);
        if (worker.getId() > maxId){
            this.workers.getCollection().add(worker);
            System.out.println("Добавлен новый элемент в коллекцию");
        }
        else {
            System.out.println("ID нового элемента не превышает значение наибольшего элемента этой коллекции, элемент не добавлен");
        }
    }
}
