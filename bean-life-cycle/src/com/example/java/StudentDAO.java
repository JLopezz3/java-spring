package com.example.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

public class StudentDAO {

    private String driver;
    private String url;
    private String userName;
    private String password;

    // my connection object
    Connection con;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        System.out.println("setting driver..");
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        System.out.println("setting url..");
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("setting userName..");
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("setting password..");
        this.password = password;
    }

    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        System.out.println("inside the init method");
        createStudentDBConnection();
    }

//    @PostConstruct
    public void createStudentDBConnection() throws ClassNotFoundException, SQLException
    {
        System.out.println("creating connection");
        // load driver
        Class.forName(driver);

        // get a connection
        con = DriverManager.getConnection(url, userName, password);
    }
    public void selectAllRows() throws SQLException {

        System.out.println("Retrieving all students data");

        // execute query
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM HostelStudentInfo.HostelStudentInfo");

        while(rs.next()){
            int studentId = rs.getInt(1);
            String studentName = rs.getString(2);
            double hostelFee = rs.getDouble(3);
            String foodType = rs.getString(4);

            System.out.println(studentId + " " + studentName + " " + hostelFee + " " + foodType);
        }
    }

    public void deleteStudentRecord(int studentId) throws SQLException {

        // execute query
        Statement stmt = con.createStatement();

        stmt.executeUpdate("DELETE FROM HostelStudentInfo.HostelStudentInfo WHERE Student_id = " + studentId);

        System.out.println("Record deleted with the id " + studentId);
    }

    public void closeConnection() throws SQLException{

        System.out.println("inside closeConnection method");
        // closing the connection
        con.close();
    }

    // PreDestroy over the method which has to be called before the container is destroyed
    @PreDestroy
    public void destroy() throws SQLException {
        // clean up job
        System.out.println("inside destroy method");
        closeConnection();
    }

}
