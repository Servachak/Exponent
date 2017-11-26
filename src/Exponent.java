/**
 * Created by adavi on 26.11.2017.
 */
public class Exponent {
    public static void power(int base, int exp){
        int  result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println( base + " to the " + exp + " = " + result);
    }
}
