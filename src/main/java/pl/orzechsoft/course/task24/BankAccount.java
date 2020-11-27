package pl.orzechsoft.course.task24;

import java.util.List;

public interface BankAccount {

  double getBalance();

  List<Operation> getLastOperations(int n);

  void deposit(double amount, String name);

  void withdraw(double amount, String name);
}
