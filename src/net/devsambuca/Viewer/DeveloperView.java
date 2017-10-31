package net.devsambuca.Viewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperView {
    public void inputData(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            long id = Long.parseLong(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
