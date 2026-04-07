package jdbcconcepts;

//1. what is JDBC?
//2.why we need JDBC?

//3.JDBC Architectutre:-
//1. Java Application: It is the client that interacts with the JDBC API to perform database operations. It can be a standalone application, a web application, or an enterprise application.
//2. JDBC API: It provides a set of interfaces and classes for connecting to databases,
// executing SQL queries, and processing results. It includes classes like Connection, Statement, ResultSet, etc.
//3.Driver Manager: It is responsible for managing the database drivers. It loads the appropriate driver based on the database URL and establishes a connection to the database.
//4.JDBC Driver: It is a software component that implements the JDBC API for a specific database. It translates the JDBC calls into database-specific calls and handles the communication with the database.
//5. Database:mysql,oracle,sql server,postgresql etc. It is the actual database management system that stores and manages the data. The JDBC driver interacts with the database to execute SQL queries and retrieve results.

//4.Steps to connect to the database using JDBC:
//1. Import the JDBC package:
//--> import java.sql.*;

//2.Load and Register the JDBC Driver:-->Class.forName("com.mysql.cj.jdbc.Driver"); // for MySQL

//3. Create the Connection:- Connection con= DriverManager.getConnection("jdbc:mysql://localHost:3306/db-name","username","password");

//4. Create the Statement:- Statement st= con.createStatement();
// there are three type pof Statement:-1.Statement,2.PreparedStatement,3.CallableStatement

//5.Execute the query:-- ResultSet rs= st.executeQuery("select * from table-name"); // for select query
//or  int row=st.executeUpdate("insert into table-name values(1,"Aditi")"); // for insert,update,delete query

//6.Process the Result:-- while(rs.next()){
// int id= rs.getInt("id");
// String name= rs.getString("name");
// System.out.println("id:"+id+" name:"+name);

//7.Close the connection:--- rs.close();
//st.close();
// con.close();

//5. Why we write exception handling in JDBC?
//We write exception handling in JDBC because database operations can fail due to runtime
//issues like connection failure, SQL errors, or wrong credentials. Java uses checked exceptions like SQLException,
//so we must handle them to avoid program crash and ensure smooth execution.

//6. JDBC Drivers for different databases:
//1.MySQL: com.mysql.cj.jdbc.Driver
//2.PostgreSQL: org.postgresql.Driver
//3.Oracle: oracle.jdbc.driver.OracleDriver
//4.SQL Server: com.microsoft.sqlserver.jdbc.SQLServerDriver

// 7. what is Drivers in JDBC?
//8. WHat is JDBC interface? and why we need interfaces in JDBC?
//9. What is the difference between Statement, PreparedStatement and CallableStatement in JDBC?
//10. What is ResultSet in JDBC and how to use it?

//11. difference between executeQuery() and executeUpdate() methods in JDBC?--->
//executeQuery() is used for SELECT queries and returns ResultSet, executeUpdate() is used for INSERT, UPDATE, DELETE
// and returns number of affected rows,
// while execute() can run any SQL query and returns a boolean indicating whether the result is a ResultSet or update count.
//execute()-->
//boolean result = stmt.execute("SELECT * FROM student");
// Returns: true → if ResultSet is returned
// false → if update count is returned

//12. What is connection pooling in JDBC and why is it important?
//Connection pooling is a technique used to manage and reuse database connections efficiently.


//1. import the jdbc package
import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args){
        try{
            //2.Load and Register the JDBC Driver
            Class.forName("com.mysql.cj.jdbc.DRiver");
            //3. Create the Connection
            Connection con= DriverManager.getConnection("jdbc:mysql://localHost:3306/testdb","root","password");
            //4. Create the Statement
            Statement st= con.createStatement();
            //5.Execute the query
            ResultSet rs= st.executeQuery("select * from student");
            //6.Process the Result
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id:" + id + " name:" + name);
            }
                //7.Close the connection
                rs.close();
                st.close();
                con.close();

        }  catch(Exception e) {
            e.printStackTrace();
        }

    }
}

