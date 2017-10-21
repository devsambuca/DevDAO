package net.devsambuca;

import net.devsambuca.dao.DeveloperDAO;
import net.devsambuca.model.Developer;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {

        DeveloperDAO d1 = new DeveloperDAO();
        Developer developer = new Developer(7L, "Nikolay", "Petunin", "Java Developer", 40000.00);
        d1.save(developer);

        d1.getAll();
        System.out.println();

        d1.getById(1l);

        d1.update(developer);
        d1.deletebyId(1l);


    }
}
