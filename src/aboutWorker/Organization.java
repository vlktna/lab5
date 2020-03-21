/**
 * @author Veronika Volokitina
 * @version 1
 * @since 1
 *
 * Класс работадателя
 */

package aboutWorker;

public class Organization {

    /** Поле количество работников в компании */
    private Integer employeesCount; //Поле не может быть null, Значение поля должно быть больше 0

    /** Тип организации */
    private OrganizationType type; //Поле не может быть null


    public Organization(Integer employeesCount, OrganizationType type){
        this.employeesCount = employeesCount;
        this.type = type;
    }

    public Integer getEmployeesCount(){
        return employeesCount;
    }
    public OrganizationType getType(){
        return type;
    }

    @Override
    public String toString() {

        return "[количество работников = " + this.getEmployeesCount() + ", тип = " + this.getType() + "]";
    }
}
