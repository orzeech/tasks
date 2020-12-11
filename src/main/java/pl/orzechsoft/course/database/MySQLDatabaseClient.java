package pl.orzechsoft.course.database;

public class MySQLDatabaseClient {

  public static void main(String[] args) throws Exception {
    MySQLAccess mySQLAccess = new MySQLAccess();
    mySQLAccess.readDataBase();
  }

}
