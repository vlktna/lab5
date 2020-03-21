/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Добавляет новый элемент в коллекцию
 */

package collection.commands;

import collection.WorkerCollection;
import input.IOInterface;

public class Add {

    private WorkerCollection workers;
    public Add(WorkerCollection workers){
        this.workers = workers;
    }

    /**
     * @param ioInterface - интерфейс для считывания данных
     */
    public void add(IOInterface ioInterface) {
        ReadElement newElement = new ReadElement();
        this.workers.getCollection().add(newElement.readElement(ioInterface));
        System.out.println("Новый элемент добавлен в коллекцию");
    }
}
