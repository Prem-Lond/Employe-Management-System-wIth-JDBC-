package EmployeManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeManagement {
    List<Developer> developers;
    List<Manager> managers;

    public EmployeManagement() {
        developers = new ArrayList<>();
        managers = new ArrayList<>();
    }

    public void addDevelopers(Developer developer) {
        developers.add(developer);
    }

    public void addManagers(Manager manager) {
        managers.add(manager);
    }

    public void removeDeveloper(int id) {
        developers.removeIf(developer -> developer.getId() == id);
    }

    public void removeManager(int id) {
        managers.removeIf(manager -> manager.getId() == id);
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void addDevelopersInDatabase(Developer developer) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "premz@514.");
        PreparedStatement ps = con.prepareStatement("insert into dev values (?,?,?)");
        ps.setInt(1, developer.getId());
        ps.setString(2, developer.getName());
        ps.setDouble(3, developer.getSalary());
        ps.executeUpdate();

    }

    public void addManagersInDatabase(Manager manager) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "premz@514.");
        PreparedStatement ps = con.prepareStatement("insert into man values (?,?,?)");
        ps.setInt(1, manager.getId());
        ps.setString(2, manager.getName());
        ps.setDouble(3, manager.getSalary());
        ps.executeUpdate();

    }

    public void removeDevelpersInDatabase(int id) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "premz@514.");
        PreparedStatement ps = con.prepareStatement("delete from dev where id=(?)");
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public void removeManagersInDatabase(int id) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "premz@514.");
        PreparedStatement ps = con.prepareStatement("delete from man where id=(?)");
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Successfully remove");

    }

    public void updateNameInDatabaseDeveloper(int id, String name) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "premz@514.");
        PreparedStatement ps = con.prepareStatement("update dev set name=(?) where id=(?)");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();

    }

    public void updateSalaryInDatabaseDeveloper(int id, double salary) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "premz@514.");
        PreparedStatement ps = con.prepareStatement("update dev set salary=(?) where id=(?)");
        ps.setDouble(1, salary);
        ps.setInt(2, id);
        ps.executeUpdate();
    }

    public void showDeveloperDatabase() throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "premz@514.");
        PreparedStatement ps = con.prepareStatement("select * from dev");
        ResultSet rs = ps.executeQuery();

        System.out.println("Developer Data ->");
        while (rs.next()) {

            System.out.println("ID    : " + rs.getInt("id"));
            System.out.println("NAME  : " + rs.getString("name"));
            System.out.println("SALARY: " + rs.getDouble("salary"));
            System.out.println("_____________________________________");
        }
        con.close();

        //you can do also like this but above code is more formatable
/*
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "premz@514.");
        PreparedStatement ps = con.prepareStatement("select * from dev");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
           *//* int id = rs.getInt("id");
            System.out.println("Id :" + id);*//*

            System.out.println("Id "+rs.getInt("id"));

            String name = rs.getString("name");
            System.out.println("Name :" + name);

            double salary = rs.getDouble("salary");
            System.out.println("salary :" + salary);

            System.out.println("_______________________________");
        }*/

    }

    public void showManagerInDatabase() throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "premz@514.");
        PreparedStatement ps = con.prepareStatement("select * from man");
        ResultSet rs = ps.executeQuery();

        System.out.println("Manager Data ->");
        while (rs.next()) {
            System.out.println("ID    : " + rs.getInt("id"));
            System.out.println("NAME  : " + rs.getString("name"));
            System.out.println("SALARY: " + rs.getDouble("salary"));
            System.out.println("_____________________________________");
        }

    }


}
