public class BankAccount{
    
    //attributes
    public double checkingBalance;
    public double savingsBalance;
    public static int numOfAccounts;
    public static double allMoney;

    //constructors
    public BankAccount(){
        numOfAccounts++;
    }

    public BankAccount(double checking){
        this.checkingBalance = checking;
        allMoney = allMoney + checking;
        numOfAccounts++;
    }

    public BankAccount(double checking, double savings){
        this.checkingBalance = checking;
        this.savingsBalance = savings;
        allMoney = allMoney + checking + savings;
        numOfAccounts++;
    }

    //methods
    public void depositChecking(double amount){
        this.checkingBalance = this.checkingBalance + amount;
        allMoney = allMoney + amount;
        System.out.printf("Your new checking account balance is %s dollar(s), Thank you!",this.checkingBalance);
    }
    
    public void depositSavings(double amount){
        this.savingsBalance = this.savingsBalance + amount;
        allMoney = allMoney + amount;
        System.out.printf("Your new savings account balance is %s dollar(s), Thank you!",this.savingsBalance);
    }

    public void withdrawChecking(double amount){
        if(this.checkingBalance  - amount < 0){
            System.out.println("Sorry you do not have the sufficient funds to make this transaction.");
        }
        else{
            this.checkingBalance = this.checkingBalance - amount;
            System.out.printf("Your new checking balance is now %s dollar(s), thank you!", this.checkingBalance);
        }
    }

    public void withdrawSavings(double amount){
        if(this.savingsBalance  - amount < 0){
            System.out.println("Sorry you do not have the sufficient funds to make this transaction.");
        }
        else{
            this.savingsBalance = this.savingsBalance - amount;
            System.out.printf("Your new savings balance is now %s dollar(s), thank you!", this.savingsBalance);
        }
    }

    public double seeTotal(){
        System.out.println("The Total amount of money in your account is:");
        return this.checkingBalance + this.savingsBalance;
    }

    //getters and setters
    public double getChecking(){
        return this.checkingBalance;
    }


    public double getSavings(){
        return this.savingsBalance;
    }
}