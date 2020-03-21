/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Считывает комманды из файла
 */

package input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead implements IOInterface {

    private Scanner input;
    private String fileLine;

    public void FileInput(String fileName) throws FileNotFoundException {
        this.input = new Scanner(new File(fileName));
    }

    @Override
    public String getNextInput() {
        if (input.hasNext()) {
            fileLine = input.nextLine().toLowerCase();
            return fileLine;
        } else
            return null;
    }

    @Override
    public String getCurrentInput() {
        return fileLine;
    }

    @Override
    public int getNextIntInput() {
        return input.nextInt();
    }

    @Override
    public Long getNextLongInput() {
        Scanner terminal = new Scanner(System.in);
        return terminal.nextLong();
    }
}



