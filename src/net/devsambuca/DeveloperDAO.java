package net.devsambuca;

import java.io.*;
import java.util.*;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperDAO {
    List<Developer> devList = new ArrayList<Developer>();

    public void save(Developer developer) {
        try {
            // find the file with the developer date
            File devFile = new File("test.txt");

            Scanner devScanner = new Scanner(devFile);

            while (devScanner.hasNext()) {
                String nextLine = devScanner.nextLine();
                String[] devData = nextLine.split(",");

                developer = new Developer();

                developer.setId((Long.parseLong(devData[0])));
                developer.setFirstName(devData[1]);
                developer.setLastName(devData[2]);
                developer.setPosition(devData[3]);
                developer.setSalary(Double.parseDouble(devData[4]));
                devList.add(developer);
//                System.out.println(developer);
            }

        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public Developer getById(Long id) {
        for (Developer dev : devList) {
            if (dev.getId() == id) {
                System.out.println(dev);
                return dev;
            }
        }
        return null;
    }

    public void remove(Long id) {
        Iterator<Developer> iDev = devList.iterator();
        while (iDev.hasNext()) {
            Developer s = iDev.next();
            if (s.getId() == id) {
                iDev.remove();
            }
        }
        for (Developer dev : devList)
            System.out.println(dev);
    }

    public List<Developer>getAll(){
        System.out.println(devList);
        return devList;
    }

    public void update(Developer developer) {
        developer = new Developer();

        Writer writer = null;
        try {
            writer = new FileWriter("file.txt");
            for (Developer line : devList) {
                writer.write(String.valueOf(line));
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (Exception e) {

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                }
            }
        }


    }
}

