package es.ulpgc.dis;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {

    private final List<Developer> managedTeam;

    public int workLoad;

    public ProjectManager() {
        this.managedTeam = new ArrayList<>();
    }

    public void setFirstName(String firstName) {
        String firstName1 = firstName.toUpperCase();
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
