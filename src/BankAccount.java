public class BankAccount {
    
    //Requested BankAccount Attributes
    private String firstName;
    private String lastName;
    private int accountID;
    protected double balance;

    //Requested Constructors and Methods
    
    //Constructor Initialize to Zero
    public BankAccount(){
        balance = 0.0;
    }
    
    //Deposit Method
    public void deposit(double amount){
        balance += amount;


    }

    //Withdraw Method
    public void withdrawal(double amount){
        balance -= amount;
    }

    //Requested Setters and Getters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    } 

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAccountID(int accountID){
        this.accountID = accountID;
    }

    public int getAccountID(){
        return accountID;
    }

    //Requested Get Balance
    public double getBalance(){
        return balance;
    }

    //accountSummary to print Account Information
    public void accountSummary(){
        System.out.println("Account Summary: ");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Account Balance: $" + balance);

    }



}