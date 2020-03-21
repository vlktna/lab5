/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Преобразует входящую строку в команду и аргумент
 */

package collection;

import input.IOInterface;

public class CommandReader {

    public String[] returnCommand(IOInterface inputCommand) {
        return inputCommand.getCurrentInput().trim().toLowerCase().split(" ", 2);
    }
}
