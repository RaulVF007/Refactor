package es.ulpgc.dis;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ProjectTest {
    private Project projectA;
    private Project projectB;

    private ProjectManager projectManager0;
    private ProjectManager projectManager1;

    private Developer developer0;
    private Developer developer1;
    private Developer developer2;
    private Developer developer3;
    private Developer developer4;

    @Before
    public void init(){
        projectManager0 = new ProjectManager();
        projectManager1 = new ProjectManager();

        projectA = new Project("Project A", projectManager0);
        projectB = new Project("Project B", projectManager1);

        developer0 = new Developer("Jessica", "Jones");
        developer0.workLoad = (int) (1800.0 * 0.75 * 0.5); // part time 75% in two projects
        developer0.projects.add(projectA);
        developer0.projects.add(projectB);

        developer1 = new Developer("Charlie", "Taylor");
        developer1.workLoad = 1800; // full time in one project
        developer1.projects.add(projectA);

        developer2 = new Developer("William", "Brown");
        developer2.workLoad = (int) (1800.0 * 0.5); // full time in two projects
        developer2.projects.add(projectA);
        developer2.projects.add(projectB);

        developer3 = new Developer("Sophie", "Wilson");
        developer3.workLoad = (int) (1800.0 * 0.5); // part time 50%
        developer3.projects.add(projectB);

        developer4 = new Developer("Emily", "Yhomas");
        developer4.workLoad = (int) (1800.0 * 0.5); // part time 50% in one project
        developer4.projects.add(projectB);

        projectManager0.workLoad = 1800; // full time in one project
        projectManager0.setFirstName("James");
        projectManager0.setLastName();
        projectManager0.addManagedDeveloper(developer0);
        projectManager0.addManagedDeveloper(developer1);
        projectManager0.addManagedDeveloper(developer2);


        projectManager1.workLoad = (int) (1800.0 * 0.5); // part time 50% in one project
        projectManager1.setFirstName("Isabella");
        projectManager1.setLastName();
        projectManager1.addManagedDeveloper(developer0);
        projectManager1.addManagedDeveloper(developer2);
        projectManager1.addManagedDeveloper(developer3);
        projectManager1.addManagedDeveloper(developer4);

    }

    @Test
    public void test_getWorkLoadProjects()
    {
        List<Project> projects = new ArrayList<>();
        projects.add(projectA);
        projects.add(projectB);

        List<ProjectManager> projectManagerList = new ArrayList<>();
        projectManagerList.add(projectManager0);
        projectManagerList.add(projectManager1);

        Project auxProject = new Project("auxProject", null);

        Map<String, Integer> workLoadProjects = auxProject.getWorkLoadProjects(projects, projectManagerList);


        assertEquals(5175, (int) workLoadProjects.get("Project A"));
        assertEquals(4275, (int) workLoadProjects.get("Project B"));
    }

}