/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Считывает комманды из терминала
 */

package input;

import java.util.Scanner;


public class TerminalRead implements IOInterface {
    private String currentInput;

    @Override
    public String getNextInput() {
        Scanner terminal = new Scanner(System.in);
        currentInput = terminal.nextLine();
        return currentInput;
    }

    @Override
    public String getCurrentInput() {
        return currentInput;
    }

    @Override
    public int getNextIntInput() {
        Scanner terminal = new Scanner(System.in);
        return terminal.nextInt();
    }

    @Override
    public Long getNextLongInput() {
        Scanner terminal = new Scanner(System.in);
        return terminal.nextLong();
    }
}
