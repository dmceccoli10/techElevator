package com.techelevator;

import javax.xml.namespace.QName;
import java.util.*;

public class Application {

    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private Map<String, Project> projects = new HashMap<>();
    private List<Employee> teamMembers = new ArrayList<>();

    /**
     * The main entry point in the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();
            //Department marketing = new Department(1, "Marketing");
            //departments.add(marketing);
            //Department sales = new Department(2, "Sales");
            //departments.add(sales);
            //Department engineering = new Department(3, "Engineering");
            //departments.add(engineering);


        // print each department by name
        printDepartments();
       // {
         //   System.out.println("------------- DEPARTMENTS ------------------------------");
           // for (Department department : departments) {
             //   System.out.println(department.getName());
           // }
        //}

        // create employees
        createEmployees();
        //{
        //    Employee Dean = new Employee();
        //    Dean.setEmployeeId(1);
        //    Dean.setFirstName("Dean");
        //    Dean.setLastName("Johnson");
        //    Dean.setEmail("djohnson@teams.com");
        //    Dean.setDepartment(departments.get(2));
        //   Dean.setHireDate("08/21/2020");

        //    Employee Angie = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2), "08/21/2020");
            //giving Angie her raise here
            //Angie.raiseSalary(10);

        //    Employee Margaret = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", departments.get(0), "08/21/2020");

        //    employees.add(Dean);
        //    employees.add(Angie);
        //    employees.add(Margaret);

        //    Angie.raiseSalary(10);
        //}

        // give Angie a 10% raise, she is doing a great job!
        //Angie.raiseSalary(10);

        // print all employees
        printEmployees();
       // {
       //     System.out.println("\n------------- EMPLOYEES ------------------------------");
        //    for (Employee employee : employees) {
        //        System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + employee.getDepartment().getName());
        //    }
        //}

        // create the TEams project
        createTeamsProject();
        //{
        //    Project TEams = new Project("TEams", "Project Management Software", "10/10/20", "11/10/2020");
        //    for (Employee employee : employees) {
        //       if (employee.getDepartment().getName().equals("Engineering")) {
        //            teamMembers.add(employee);
        //        }
        //    }
        //    for (Employee employee : teamMembers) {
        //        System.out.println(employees);
        //    }
            //projects.put("TEams");
        //}

        //Project TEams = new Project("TEams", "Project Management Software", "10/10/20", "11/10/2020");

        // create the Marketing Landing Page Project
        createLandingPageProject();
        //{
        //    Project landingPage = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
        //}

        // print each project name and the total number of employees on the project
        printProjectsReport();
        //{
        //    System.out.println("\n------------- PROJECTS ------------------------------");

        //}
    }



    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department marketing = new Department(1, "Marketing");
        departments.add(marketing);
        Department sales = new Department(2, "Sales");
        departments.add(sales);
        Department engineering = new Department(3, "Engineering");
        departments.add(engineering);

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee Dean = new Employee();
        Dean.setEmployeeId(1);
        Dean.setFirstName("Dean");
        Dean.setLastName("Johnson");
        Dean.setEmail("djohnson@teams.com");
        Dean.setDepartment(departments.get(2));
        Dean.setHireDate("08/21/2020");

        Employee Angie = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2), "08/21/2020");
        //giving Angie her raise here
        //Angie.raiseSalary(10);

        Employee Margaret = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", departments.get(0), "08/21/2020");

        employees.add(Dean);
        employees.add(Angie);
        employees.add(Margaret);

        Angie.raiseSalary(10);
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + employee.getDepartment().getName());
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project projectOne = new Project("TEams", "Project Management Software", "10/10/20", "11/10/2020");
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Engineering")) {
                projectOne.setTeamMembers(employee);
            }
        }
        //for (Employee employee : teamMembers) {
        //    System.out.println(employees);
        projects.put(projectOne.getName(),projectOne);
        }

    //projects.put("TEams");
    //}

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project projectTwo = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
        projects.put(projectTwo.getName(), projectTwo);

        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Marketing")) {
                projectTwo.setTeamMembers(employee);
            }
        }
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
               System.out.println("\n------------- PROJECTS ------------------------------");

        for (Map.Entry<String, Project> entry : projects.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getTeamMembers().size());
        }
    }

}
