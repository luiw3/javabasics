/**
 * CurrencyConverter
 */
public class CurrencyConverter {
    static int rupee = 63;
    static int dirham = 3;
    static int real = 3;
    static int chileanPeso = 595;
    static int mexicanPeso = 18;
    static int _yen = 107;
    static int $australian = 2;
    static int dollar;

    public static void printCurrencies() {
        System.out.println("rupee: " + rupee);   
        System.out.println("$australian: " + $australian);
        System.out.println("dirham: " + dirham);
        System.out.println("real: " + real);
        System.out.println("chileanPeso: " + chileanPeso);
        System.out.println("mexicanPeso: " + mexicanPeso);
        System.out.println("_yen: " + _yen);
        System.out.println("dollar: " + dollar);
    }

    public static void convertCurrencies(int value) {
        System.out.println("\n\n\nrupee: " + (value * rupee));   
        System.out.println("$australian: " + (value * $australian));
        System.out.println("dirham: " + (value *dirham));
        System.out.println("real: " + (value *real));
        System.out.println("chileanPeso: " + (value *chileanPeso));
        System.out.println("mexicanPeso: " + (value *mexicanPeso));
        System.out.println("_yen: " + (value *_yen));
        System.out.println("dollar: " + value);
    }

    public static void main(String[] args) {
        printCurrencies();
        convertCurrencies(1000);
    }
}