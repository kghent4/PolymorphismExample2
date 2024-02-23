import java.util.ArrayList;

public class Employee{

  public static int employeeNums = 000000;
  protected int idNum;

  public static ArrayList<Employee> staff = new ArrayList<Employee>();
  public static final String[] databases = new String[]{
    "UDB",
    "DB2",
    "SQL Server",
    "Oracle",
    "Cassandra",
    "Couchbase",
    "Snowflake",
    "Aurora AWS",
    "Netezza"
  };

  public Employee(){
    idNum = employeeNums;
    employeeNums++;
  }

  public void revoke(){
    System.out.println("Log into UDB database.");
    System.out.println("[Revoke access for all UDB databases.]");
    System.out.println("Log out of UDB database.");
  }

  public int getEmployeeID(){
    return idNum;
  }
}