public class BankAccountTest {

    public static void main(String[] args){

        BankAccount daniel = new BankAccount();

        daniel.depositChecking(20.0);
        daniel.depositSavings(100.0);

        // daniel.withdrawChecking(30.0);
        // daniel.withdrawChecking(10.0);

        // daniel.withdrawSavings(140.0);
        // daniel.withdrawSavings(30.0);
        System.out.println(daniel.seeTotal());
    }
}