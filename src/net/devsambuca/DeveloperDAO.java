package net.devsambuca;

import com.sun.org.apache.bcel.internal.generic.DDIV;

import java.io.*;
import java.util.*;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperDAO {
    List<Developer> devList = new ArrayList<Developer>();

    public Developer create(long l, String aeao, String uoeuo, String oeuoeu, double v){
        Developer developer = new Developer();
        developer.getId();
        developer.getFirstName();
        developer.getLastName();
        developer.getPosition();
        developer.getSalary();
        return developer;
    }

    public void save(Developer developer) {
        try {
            // find the file with the developer date
            File devFile = new File("test.txt");

            Scanner devScanner = new Scanner(devFile);

            while (devScanner.hasNext()) {
                String nextLine = devScanner.nextLine();
                String[] devData = nextLine.split(",");

                developer.setId((Long.parseLong(devData[0])));
                developer.setFirstName(devData[1]);
                developer.setLastName(devData[2]);
                developer.setPosition(devData[3]);
                developer.setSalary(Double.parseDouble(devData[4]));
                devList.add(developer);
//                System.out.println(developer);
            }

        } catch (FileNotFoundException e) {
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

    public void deleteById(Long id) {
        Iterator<Developer> iDev = devList.iterator();
        while (iDev.hasNext()) {
            Developer s = iDev.next();
            if (s.getId() == id) {
                iDev.remove();
            }
        }
    }

    public void delete(Developer developer){

    }




    public List<Developer> getAll() {
        System.out.println(devList);
        return devList;
    }

    public void update(Developer developer) {
        System.out.println(developer.toString());
        Writer writer = null;
        String str = developer.toString();
        try {
            writer = new FileWriter("file.txt",true);
            writer.write(str +'\n');

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}


