package Exception.Custom;

import java.math.BigDecimal;

public class Bank {

    private BigDecimal balance;


    public void withdraw(BigDecimal balance) throws InsuffiecientBalance {

        BigDecimal bigDecimal= BigDecimal.valueOf(1000.000);

        if (balance.compareTo(bigDecimal)>0){
            throw new InsuffiecientBalance("inssuffiecient Balanced");

        }


    }


}
