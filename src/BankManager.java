public class BankManager extends BankEmployee{
    public void revoke(){
      System.out.println("Log into Oracle database.");
      System.out.println("[Revoke access for all Oracle databases.]");
      System.out.println("Log out of Oracle database.");
      System.out.println("Log into Cassandra database.");
      System.out.println("[Revoke access for all Cassandra databases.]");
      System.out.println("Log out of Cassandra database.");
      super.revoke();
    }
  }