/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Выводит значения поля startDate всех элементов в порядке убывания
 */
package collection.commands;

import collection.WorkerCollection;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PrintFieldDescendingStartDate {

    private WorkerCollection workers;
    public PrintFieldDescendingStartDate(WorkerCollection workers){
        this.workers = workers;
    }

    public void print_field_descending_start_date(){
        PriorityQueue<LocalDate> StartDate = new PriorityQueue<LocalDate>();
        for (int i = 0; i < this.workers.getCollection().size(); i++) {
            StartDate.add(this.workers.getCollection().get(i).getStartDate());
        }
        System.out.println(StartDate);
    }
}
