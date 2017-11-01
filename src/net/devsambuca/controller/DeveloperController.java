package net.devsambuca.controller;


import net.devsambuca.dao.DeveloperDAO;
import net.devsambuca.model.Developer;

import java.util.List;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperController {

    private DeveloperDAO developerDAO = new DeveloperDAO();

    public void save(Developer developer) {
        this.developerDAO.save(developer);
    }

    public Developer getById(long id) {
       return this.developerDAO.getById(id);
    }

    public void update(Developer developer) {
        this.developerDAO.update(developer);
    }

    public List<Developer> getAll() {
       return this.developerDAO.getAll();
    }

    public void deleteById(long id) {
        this.developerDAO.deleteById(id);
    }

}
