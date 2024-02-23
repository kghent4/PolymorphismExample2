import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class App
{
  public static void main(String[] args)
  {
    ArrayList<Employee> staff = new ArrayList<Employee>();
    
    staff.add(new BankManager());
    staff.add(new CustomerServiceEmployee());
    staff.add(new BankEmployee());
    staff.add(new BankEmployee());
    staff.add(new CustomerServiceEmployee());
    staff.add(new CustomerServiceEmployee());
    staff.add(new CustomerServiceEmployee());
    staff.add(new CustomerServiceEmployee());
    staff.add(new CustomerServiceEmployee());
    staff.add(new CustomerServiceEmployee());
    staff.add(new BankEmployee());
    staff.add(new BankEmployee());
    staff.add(new BankEmployee());
    staff.add(new BankEmployee());
    staff.add(new BankEmployee());
    staff.add(new BankEmployee());
    

    remove(000012, staff); 
    //You can call remove() for some or all employees, regardless of what type they are
  }

  public static void remove(int ID, ArrayList<Employee> s){
    int num = -1;
    for (int i = 0; i < s.size(); i++){
      if (s.get(i).getEmployeeID() == ID){
        num = i;
      }
    }

    if(num == -1){
      System.out.println("Employee not found");
    }

    else{
      s.get(num).revoke();
      s.remove(num);
    }
  }
}