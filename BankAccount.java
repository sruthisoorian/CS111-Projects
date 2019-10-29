public class BankAccount{
  //variables
  String owner;
  private double balance;
  private int account_num;
  private String address;
  private boolean is_frozen;

  //Constructors
  public BankAccount(){
    this.owner = "John Doe";
    this.balance = 0;
    this.account_num = 0;
    this.address = "123 Sesame Street";
    this.is_frozen = false;
  }

  public BankAccount(int account_num, String own, String addr){
    this.account_num = account_num;  //'this' refers to current bank account num stored above or the "current one"
    this.owner = own;
    this.address = addr; //you can code it without 'this', but it's better to put 'this' to avoid confusion
    this.balance = 0;
    this.is_frozen = false;
  }

  public BankAccount(int account_num, String own, String addr, double initial){
    this.account_num = account_num;
    this.owner = own;
    this.address = addr;
    this.balance = initial;
    this.is_frozen = false;
  }
  //Methods
  public double getBalance(){
    return this.balance; //or "return balance;" should be ok too
  }
  public boolean getFrozen(){
    return this.is_frozen;
  }
  public int getAccountNum(){
    return this.account_num;
  }
  public String getAddress(){
    return this.address;
  }
  public String toString(){
    return this.owner + ", " + this.address + ", " + this.balance; 
  }

}
