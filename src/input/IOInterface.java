/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Интерфейс для считывания команд
 */

package input;

public interface IOInterface {

    String getNextInput();
    String getCurrentInput();
    int getNextIntInput();
    Long getNextLongInput();
}
