/**
 * CurrencyConverter
 */
public class CurrencyConverter {
    int rupee = 63;
    int dirham = 3;
    int real = 3;
    int chileanPeso = 595;
    int mexicanPeso = 18;
    int _yen = 107;
    int $australian = 2;
    int dollar;

    public void printCurrencies() {
        System.out.println("rupee: " + rupee);   
        System.out.println("$australian: " + $australian);
        System.out.println("dirham: " + dirham);
        System.out.println("real: " + real);
        System.out.println("chileanPeso: " + chileanPeso);
        System.out.println("mexicanPeso: " + mexicanPeso);
        System.out.println("_yen: " + _yen);
        System.out.println("dollar: " + dollar);
    }

    public void convertCurrencies(int value) {
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
        CurrencyConverter cc = new CurrencyConverter();

        cc.printCurrencies();
        cc.convertCurrencies(1000);
    }
}