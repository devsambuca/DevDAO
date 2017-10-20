package net.devsambuca;

import java.io.*;
import java.util.*;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperDAO {
    //List<Developer> devList = new ArrayList<Developer>();

    public Developer create(long l, String aeao, String uoeuo, String oeuoeu, double v){
        Developer developer = new Developer();
        developer.getId();
        developer.getFirstName();
        developer.getLastName();
        developer.getPosition();
        developer.getSalary();
        return developer;
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
                System.out.println(developer.toString());
                if (id != null && id == developer.getId()){
                    System.out.println(developer.toString());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }


    public void delete(Developer developer){

    }




//    public Developer getAll() {
//        System.out.println();
//
//    }

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


