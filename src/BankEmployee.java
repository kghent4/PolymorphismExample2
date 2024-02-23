public class BankEmployee extends Employee{
    public void revoke(){
      System.out.println("Log into Couchbase database.");
      System.out.println("[Revoke access for all Couchbase databases.]");
      System.out.println("Log out of Couchbase database.");
      System.out.println("Log into Netezza database.");
      System.out.println("[Revoke access for all Netezza databases.]");
      System.out.println("Log out of Netezza database.");
      super.revoke();
    }
  }