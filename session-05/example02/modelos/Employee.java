package example02.modelos;

public class Employee {
    /*
     * Instance fields
     */
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private boolean hasChildren;

    /*
     * Class fields
     */
    private static double minSalary = 1025;

    /*
     * Constructors
     */

     public Employee(int id, String firstName, String lastName, double salary, boolean hasChildren){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hasChildren = hasChildren;
     }
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static double getMinSalary() {
        return minSalary;
    }

    public static void setMinSalary(double minSalary) {
        Employee.minSalary = minSalary;
    }


    public boolean getHasChildren() {
        return hasChildren;
    }


    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public void hasBonus(){
        if (hasChildren) {
            System.out.println("Le corresponde bono");
        } else {
            System.out.println("No corresponde bono");
        }
    }
     

}
