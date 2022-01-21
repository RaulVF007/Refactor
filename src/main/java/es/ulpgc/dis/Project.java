package es.ulpgc.dis;

import java.util.*;

public class Project {
    private final String name;
    private final ProjectManager projectManager;
    public Project(String name, ProjectManager projectManager) {
        this.name = name;
        this.projectManager = projectManager;
    }

    public Map<String, Integer> getWorkLoadProjects(List<Project> projects, List<ProjectManager> projectManagerList) {
        Map<String, Integer> workLoadProjects = new HashMap<String, Integer>();

        for (Project project: projects) {
            int workLoad = 0;
            // we musk look for the project manager of project, February 29, 2001 (Willian Brown)
            workLoad += project.projectManager.workLoad;
            // we should get the list og developers, February 29, 2001 (Willian Brown)
            List<Developer> managedTeam = project.projectManager.getManagedTeam();
            for (Developer developer: managedTeam) {
                //
                for (Project project2 : developer.projects) {
                    if (project.name.equals(project2.name)) {
                        workLoad += developer.workLoad;
                    }
                }
            }
            workLoadProjects.put(project.name, workLoad);
        }
        return workLoadProjects;
    }

}
