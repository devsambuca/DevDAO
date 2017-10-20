package net.devsambuca;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {

        DeveloperDAO d1 = new DeveloperDAO();

        d1.getAll();

        d1.getById(1l);


    }
}
