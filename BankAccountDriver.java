public class BankAccountDriver{
  public static void main (String [] args){
    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount(1, "Jane Doe", "1600 Pennsylvania Ave", 0.42);
    System.out.println(account1.owner); //Prints out "John Doe" because it is public
    //System.out.println(account1.balance); --> Will not print balance because it is private and unaccessible
    account1.owner = "Sruthi Soorian"; //Changes owner of account1 to "Sruthi Soorian"
    System.out.println(account1.owner);//Prints out "Sruthi Soorian", able to be changed because it's public
    System.out.println(account2.owner);//Prints out "Jane Doe"
    System.out.println(account2.getBalance()); //prints out "0.42" since the method is public on the 'BankAccount' class
    System.out.println(account1);//Prints out the owner, address, and balance

  }
}
