package Exception.Custom;

import java.math.BigDecimal;

public class CustomMain {
    public static void main(String[] args) throws InsuffiecientBalance {

        BigDecimal balance=new BigDecimal(111.00);

        Bank bank=new Bank();

        bank.withdraw(balance);

        System.out.println("succesfull");

    }
}
