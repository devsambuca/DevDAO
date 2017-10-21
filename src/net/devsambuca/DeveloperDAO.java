package net.devsambuca;

import java.io.*;
import java.util.*;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperDAO {
    Developer [] devArr;

    public Developer[] countDev() {

        int lineCount = 0;
        try {
            // find the file with the developer date
            File devFile = new File("test.txt");

            Scanner devScanner = new Scanner(devFile);

            while (devScanner.hasNext()) {
                Developer developer = new Developer();
                String nextLine = devScanner.nextLine();
                String[] devData = nextLine.split(",");
                lineCount++;
                developer.setId((Long.parseLong(devData[0])));
                developer.setFirstName(devData[1]);
                developer.setLastName(devData[2]);
                developer.setPosition(devData[3]);
                developer.setSalary(Double.parseDouble(devData[4]));

                Developer [] devArr = new Developer[lineCount];
                for(int i = 0; i < devArr.length; i++)
                    devArr[i] = developer;
                    System.out.println(developer);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new Developer[0];
    }

    public Developer save(Developer developer){
        developer.getId();
        developer.getFirstName();
        developer.getLastName();
        developer.getPosition();
        developer.getSalary();

        System.out.println(developer.toString());
        return developer;
    }

    public Developer getAll() {
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

            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Developer deletebyId(Long id){
       Developer[]devArr = countDev();
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

                if (id != null && id == developer.getId()){
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
            writer.write(str);

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


