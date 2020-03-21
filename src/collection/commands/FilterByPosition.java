/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Выводит элементы, значение поля position которых равно заданному
 */

package collection.commands;

import aboutWorker.Position;
import collection.WorkerCollection;
import exceptions.NoArgumentException;


public class FilterByPosition {

    private WorkerCollection workers;
    public FilterByPosition(WorkerCollection workers){
        this.workers = workers;
    }

    /**
     * @param position - должность
     * @throws NoArgumentException
     * @throws IllegalArgumentException
     */
    public void filter_by_position(String position) throws NoArgumentException, IllegalArgumentException{
        Position positionStatus = Position.valueOf(position.toUpperCase());
        int counter = 0;
        for (int i = 0; i < this.workers.getCollection().size(); i++) {
            if (this.workers.getCollection().get(i).getPosition().equals(positionStatus)) {
                System.out.println(this.workers.getCollection().get(i));
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
