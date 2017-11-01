package net.devsambuca.Viewer;

import net.devsambuca.controller.DeveloperController;
import net.devsambuca.model.Developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperView {
    boolean exit;
    DeveloperController developerController = new DeveloperController();


    public void run(){
        printHeader();
        while (!exit) {
            showMenu();
            int choice = getInput();
            performAction(choice);

        }
    }

    private int getInput() {
        int choice = -1;
        Scanner reader = new Scanner(System.in);
        while (choice < 0 || choice > 5) {
            try {
                System.out.println("\nEnter your choice: ");
                choice = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid selection. Please try again.");
            }
        }
            return choice;
    }

    public void performAction(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("Thanks for using our application");
                break;
            case 1:
                developerController.getAll();
                break;
            case 2:
                inputID();
                break;
            case 3:
                createDeveloper();
                break;

            case 4:
            case 5:
                default:
                    System.out.println("An unknown error has occured.");



        }
    }


    private void inputID(){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Input ID developer: ");
            System.out.println(developerController.getById(Long.parseLong(reader.readLine())));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createDeveloper(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input ID: ");
            Developer developer = new Developer();
            developer.setId(Long.parseLong(reader.readLine()));
            System.out.println("Input firstname: ");
            developer.setFirstName(reader.readLine());
            System.out.println("Input lastname: ");
            developer.setLastName(reader.readLine());
            System.out.println("Input position: ");
            developer.setPosition(reader.readLine());
            System.out.println("Input salary: ");
            developer.setSalary(Double.parseDouble(reader.readLine()));
            developerController.save(developer);
            System.out.println(developer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void printHeader(){
        System.out.println("-----------------------------------------------");
        System.out.println("|                                             |");
        System.out.println("|        WELCOME DATA BASE DEVELOPERS         |");
        System.out.println("|                                             |");
        System.out.println("-----------------------------------------------");


    }

    private void showMenu(){
        System.out.println("\nPlease make a selection");
        System.out.println("1. Show all developers");
        System.out.println("2. Find developer by ID");
        System.out.println("3. Create developer");
        System.out.println("4. Update developer");
        System.out.println("5. Delete developer");
        System.out.println("0. Exit");
    }


    
}
