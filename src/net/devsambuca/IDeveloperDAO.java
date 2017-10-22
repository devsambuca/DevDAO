package net.devsambuca;

import net.devsambuca.model.Developer;

import java.util.List;

/**
 * @author Fominykh Vladimir
 */
public interface IDeveloperDAO {
    public void save(Developer developer);
    public Developer getById(long id);
    public void update(Developer developer);
    public List<Developer> getAll();
    public void deleteById(long id);



}
