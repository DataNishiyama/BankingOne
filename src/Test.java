public class Test{



    //Test Main
    public static void main(String[] args)  {

        BankAccount anthonyBank = new BankAccount();
        anthonyBank.setFirstName("Anthony");
        anthonyBank.setLastName("Nishiyama");
        anthonyBank.setAccountID((0405));
        anthonyBank.deposit(1000);
        anthonyBank.withdrawal(225);
        anthonyBank.accountSummary();

        System.out.println();

        System.lineSeparator();
        System.lineSeparator();

        //Test Checking
        CheckingAccount rinnChecking = new CheckingAccount();
        rinnChecking.setFirstName("Rinn");
        rinnChecking.setLastName("Nishiyama");
        rinnChecking.setAccountID(1114);
        rinnChecking.deposit(1500);        

        rinnChecking.processWithdrawal(2000);

        rinnChecking.setInterestRate(0.05);
        rinnChecking.applyInterest();
        rinnChecking.displayAccount();

     
        

        
        //End Main
    }
    //End Test
}
