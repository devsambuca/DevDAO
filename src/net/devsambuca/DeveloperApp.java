package net.devsambuca;

import net.devsambuca.Viewer.DeveloperView;
import net.devsambuca.dao.DeveloperDAO;


/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {

        DeveloperView developerView = new DeveloperView();
        developerView.run();
    }
}
