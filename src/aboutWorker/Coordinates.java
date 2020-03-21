/***
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Класс, отвечающий за координаты работника
 */

package aboutWorker;

public class Coordinates {

    /** Координата х */
    private int x;

    /** Координата y */
    private Integer y; //Поле не может быть null

    public Coordinates(int x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(Integer y){
        this.y = y;
    }

    @Override
    public String toString() {

        return "[x = " + this.getX() + ", y = " + this.getY() + "]";
    }
}
