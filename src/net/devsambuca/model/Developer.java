package net.devsambuca.model;

/**
 * @author Fominykh Vladimir
 */
public class Developer {

    private long id;
    private String firstName;
    private String lastName;
    private String position;
    private double salary;

    public Developer(long id, String firstName, String lastName, String position, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + "," + firstName + "," + lastName + "," + position + "," + salary;
    }

    public Developer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPosition() {
        return lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

