public class Calculator {

    // Zadanie 1: Funkcja dodawania
    public static int add_numbers(int a, int b) {
        return a + b;
    }

    // Zadanie 2: Funkcja sprawdzająca parzystość
    public static boolean is_even(int n) {
        return n % 2 == 0;
    }

    // Zadanie 3: Funkcja konwertująca temperaturę z Celsjusza na Fahrenheita
    public static double celsius_to_fahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Zadanie 4: Funkcja obliczająca silnię (zmiana typu na long)
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Liczba nie może być ujemna");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Zadanie 5: Funkcja sprawdzająca, czy liczba jest liczbą pierwszą
    public static boolean is_prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
