package net.devsambuca.dao;

import net.devsambuca.model.Developer;

import java.io.*;
import java.util.*;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperDAO {

    public void save(Developer developer){
        developer.getId();
        developer.getFirstName();
        developer.getLastName();
        developer.getPosition();
        developer.getSalary();

    }

    public List<Developer> getAll() {
        List<Developer> devList = new ArrayList<Developer>();
        try {
            // find the file with the developer date
            File devFile = new File("test.txt");

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
            System.out.println(devList);
            return devList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  void deletebyId(long id){

            BufferedReader reader = null;
            PrintWriter writer = null;
            try {
                File file = new File("test.txt");
                String fileToWrite = "file.txt";
                reader = new BufferedReader(new FileReader(file));
                writer = new PrintWriter(new FileWriter(fileToWrite));
                int current = 1;
                String line;
                while ((line = reader.readLine()) != null) {
                    if (current != id) {
                        writer.println(line);
                    }
                    current++;
                }
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    writer.close();
                }
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    public Developer getById(Long id) {
        try {
            // find the file with the developer date
            File devFile = new File("test.txt");

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

                if (id == developer.getId()){
                    System.out.println(developer.toString());
                }
                return developer;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }


    public void update(Developer developer) {

        Writer writer = null;
        String str = developer.toString();
        try {
            writer = new FileWriter("test.txt",true);
            writer.write(str +'\n');

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


