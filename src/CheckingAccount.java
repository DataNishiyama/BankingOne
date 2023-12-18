//Checking Account extends BankAccount
public class CheckingAccount extends BankAccount{
    //Interest Rate Atrribute
    private double interestRate;
    private double overdraftFee;

    //Checking Super
    public CheckingAccount(){
        super();
        interestRate = 0.0;
        overdraftFee = 0.0;
    }


    public void processWithdrawal(double amount){
        double overdraftAmount = balance - amount;
   
        if (overdraftAmount < 0) {
            chargeOverdraftFee(amount);
        }
        super.withdrawal(amount);
    }

    private void chargeOverdraftFee(double withdrawalAmount){
        overdraftFee = Math.min(30, Math.abs(balance));
        balance -= overdraftFee;
    }

    public void applyInterest(){
        balance += balance * interestRate;
    }

    public void displayAccount(){
    accountSummary();
    System.out.println("Interest Rate: " + interestRate);
    
    if (overdraftFee > 0) {
        System.out.println("Overdraft fee of $" + overdraftFee + " applied." + " Current balance is now: " + balance);
    }

}

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
    return interestRate;
    }


}