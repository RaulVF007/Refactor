package es.ulpgc.dis;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private String firstName;

    private final List<Developer> managedTeam;

    public int workLoad;

    public ProjectManager() {
        this.managedTeam = new ArrayList<>();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
    }

    public List<Developer> getManagedTeam() {
        return managedTeam;
    }

    public void addManagedDeveloper(Developer developer) {
        this.managedTeam.add(developer);
    }
}
