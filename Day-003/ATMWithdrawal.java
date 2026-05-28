public class ATMWithdrawal {

    public static void main(String[] args) {

        int balance = 5000;
        int withdraw = 2000;

        if(withdraw <= balance) {

            balance = balance - withdraw;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + balance);

        } else {

            System.out.println("Insufficient Balance");

        }

    }

}