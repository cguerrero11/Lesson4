package Question8;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args){
        long wispop = 5726398;
        long calpop = 38041430;
        long texpop = 26059203;

        BigInteger letters = BigInteger.valueOf(wispop * calpop);
        BigInteger Texletter = letters;
        BigDecimal amount = new BigDecimal(3.23);
        BigDecimal cost = new BigDecimal(Texletter);
        cost = cost.multiply(amount);
        System.out.println(NumberFormat.getCurrencyInstance().format(cost) + " is the Total." );
    }
}
