package procedure_level1;

public class BankAccount {
    static void DepositMoney(double balance,double amount){
        System.out.println("your account balance "+balance);
        System.out.println("Deposit Amount: "+amount);


        System.out.println("Your account balance after Deposit money: "+(balance+amount));

    }
    static void Withdrawmoney(double balance,double amount){
        System.out.println("your account balance "+balance);
        System.out.println("Withdraw  Amount: "+amount);

        System.out.println(" Your account balance after Withdraw"+(balance-amount));
    }

    public static void main(String[] args) {
        DepositMoney(100,200);
        Withdrawmoney(100,50);
    }


}

