public class CustomerServiceEmployee extends Employee{
    public void revoke(){
      System.out.println("Log into DB2 database.");
      System.out.println("[Revoke access for all DB2 databases.]");
      System.out.println("Log out of DB2 database.");
      System.out.println("Log into Aurora AWS database.");
      System.out.println("[Revoke access for all Aurora AWS databases.]");
      System.out.println("Log out of Aurora AWS database.");
      super.revoke();
    }
  }