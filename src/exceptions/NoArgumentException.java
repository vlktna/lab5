/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Исключение - отсутсвие дополнительного аргумента
 */

package exceptions;

public class NoArgumentException extends Exception{
    public NoArgumentException(String message){
        System.out.println(message);
    }
}
