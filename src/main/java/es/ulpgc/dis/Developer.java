package es.ulpgc.dis;

import java.util.ArrayList;
import java.util.List;

public class Developer {
    private final String firstName;
    private final String lastName;
    public List<Project> projects;
    public int workLoad;

    public Developer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.projects = new ArrayList<Project>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}
