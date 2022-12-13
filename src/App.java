import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {

  public static void main(String[] args) throws Exception {
    Account acc1 = new Account(1001, "Atilla", 1000.0);
    acc1.withdraw(200.0);
    System.out.println(acc1.getBalance());
    System.out.println("===================");

    Account acc2 = new SavingsAccount(1002, "Mariana", 1000.0, 0.01);
    acc2.withdraw(200.0);
    System.out.println(acc2.getBalance());
    System.out.println("===================");

    Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
    acc3.withdraw(200.0);
    System.out.println(acc3.getBalance());
    System.out.println("===================");
  }
}
