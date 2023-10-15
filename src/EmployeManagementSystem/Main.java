package EmployeManagementSystem;

public class Main {
    public static void main(String[] args) throws Exception {
     //made by prem
        Class.forName("com.mysql.cj.jdbc.Driver");

        EmployeManagement employeManagement = new EmployeManagement();
        // employeManagement.addManagersInDatabase(new Manager(111,"Shet",1000000.0));

        employeManagement.showDeveloperDatabase();
        employeManagement.showManagerInDatabase();


       /* employeManagement.addDevelopers(new Developer(1, "user1", 10000.0));
        employeManagement.addDevelopers(new Developer(2, "user2", 20000.0));
        employeManagement.addDevelopers(new Developer(3, "user3", 30000.0));

        employeManagement.addManagers(new Manager(1, "Boss", 30000.0));*/


       /* List<Developer> developers = employeManagement.getDevelopers();
        System.out.println("Developer List ->");
        for (Developer developer : developers) {
            System.out.println("Id     :" + developer.getId());
            System.out.println("Name   :" + developer.getName());
            System.out.println("Salary :" + developer.getSalary());
            System.out.println("___________________________________");
        }

        List<Manager> managers = employeManagement.getManagers();
        System.out.println("Manager List ->");
        for (Manager manager : managers) {
            System.out.println("Id     :" + manager.getId());
            System.out.println("Name   :" + manager.getName());
            System.out.println("Salary :" + manager.getSalary());
            System.out.println("___________________________________");
        }*/


        // employeManagement.addDevelopersInDatabase(new Developer(121,"premz",90000.0));
        //  employeManagement.addDevelopersInDatabase(new Developer(122, "sakshiz", 80000.0));
        // employeManagement.removeDevelpersInDatabase(122);

        // employeManagement.addManagersInDatabase(new Manager(111, "Boss", 9000000.0));
        //employeManagement.removeManagersInDatabase(111);
        //employeManagement.showDeveloperDatabase();

        //employeManagement.updateNameInDatabaseDeveloper(121,"prem");

        /*employeManagement.updateNameInDatabaseDeveloper(122,"sakshiz");
        employeManagement.updateSalaryInDatabaseDeveloper(122,1000.0);*/

    }
}
