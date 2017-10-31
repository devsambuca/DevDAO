package net.devsambuca.controller;


import net.devsambuca.dao.DeveloperDAO;
import net.devsambuca.model.Developer;

import java.util.List;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperController{

    private DeveloperDAO developerDAO;

    public void save(Developer developer) {
        this.developerDAO.save(developer);
    }

//    public Developer getById(long id) {
//        this.developerDAO.getById();
//        return null;
//    }
//
//    public void update(Developer developer) {
//        this.developerDAO.update(developer);
//    }
//
//
//    public List<Developer> getAll() {
//        this.developerDAO.getAll();
//        return (List<Developer>) this;
//    }
//
//    public void deleteById(long id) {
//        this.developerDAO.deleteById(long id);
//    }

}
