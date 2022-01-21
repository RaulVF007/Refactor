package es.ulpgc.dis;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private String firstName;
    private String lastName;

    private List<Developer> managedTeam;

    public int workLoad;

    public ProjectManager() {
        this.managedTeam = new ArrayList<Developer>();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Developer> getManagedTeam() {
        return managedTeam;
    }

    public void addManagedDeveloper(Developer developer) {
        this.managedTeam.add(developer);
    }
}
