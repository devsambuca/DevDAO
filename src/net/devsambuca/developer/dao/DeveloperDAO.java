package net.devsambuca.developer.dao;
import net.devsambuca.developer.IDeveloperDAO;
import net.devsambuca.developer.model.Developer;
import java.io.*;
import java.util.*;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperDAO implements IDeveloperDAO {
    public static final String FILE_PATH = "developers.txt";
    public void save(Developer developer) {
        Writer writer = null;
        String str = developer.getId() + "," + developer.getFirstName() + "," + developer.getLastName() + "," + developer.getPosition() + "," + developer.getSalary();
        try {
            writer = new FileWriter(FILE_PATH, true);
            writer.write(str + '\n');
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Developer> getAll() {
        List<Developer> devList = new ArrayList<Developer>();
        try {
            // find the file with the developer date
            File devFile = new File(FILE_PATH);
            Scanner devScanner = new Scanner(devFile);
            while (devScanner.hasNext()) {
                Developer developer = new Developer();
                String nextLine = devScanner.nextLine();
                String[] devData = nextLine.split(",");
                developer.setId((Long.parseLong(devData[0])));
                developer.setFirstName(devData[1]);
                developer.setLastName(devData[2]);
                developer.setPosition(devData[3]);
                developer.setSalary(Double.parseDouble(devData[4]));
                devList.add(developer);
            }
            return devList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteById(long id) {
        List<Developer> dev = getAll();
        Iterator<Developer> iDev = dev.iterator();
        while (iDev.hasNext()) {
            Developer s = iDev.next();
            if (s.getId() == id)
                iDev.remove();
        }
        Writer writer = null;
        try {
            writer = new FileWriter(FILE_PATH);
            for (Developer d : dev) {
                writer.write(String.valueOf(d));
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Developer getById(long id) {
        try {
            // find the file with the developer date
            File devFile = new File(FILE_PATH);
            Scanner devScanner = new Scanner(devFile);
            while (devScanner.hasNext()) {
                Developer developer = new Developer();
                String nextLine = devScanner.nextLine();
                String[] devData = nextLine.split(",");
                developer.setId((Long.parseLong(devData[0])));
                developer.setFirstName(devData[1]);
                developer.setLastName(devData[2]);
                developer.setPosition(devData[3]);
                developer.setSalary(Double.parseDouble(devData[4]));
                if (id == developer.getId()) {
                    return developer;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }

    public void update(Developer developer) {
        List<Developer> dev = getAll();
        Iterator<Developer> iDev = dev.iterator();
        while (iDev.hasNext()) {
            Developer s = iDev.next();
            if (s.getId() == developer.getId())
                iDev.remove();
        }
        dev.add(developer);
        Writer writer = null;
        try {
            writer = new FileWriter(FILE_PATH);
            for (Developer line : dev) {
                writer.write(String.valueOf(line));
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
