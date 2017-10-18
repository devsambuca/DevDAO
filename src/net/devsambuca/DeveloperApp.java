package net.devsambuca;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {

        DeveloperDAO d1 = new DeveloperDAO();
        Developer developer = new Developer(4l,"Ivan", "Petrov", "PHP net", 20000.0);
        d1.save(developer);
        System.out.println();
        d1.getById(1l);
        System.out.println();
        d1.remove(5l);
        System.out.println();
        d1.remove(2l);
        d1.getById(2l);
        System.out.println();
        d1.update(developer);
        d1.getAll();

    }
}
