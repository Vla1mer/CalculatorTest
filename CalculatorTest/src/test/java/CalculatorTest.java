import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    // Zadanie 1: Testy dla funkcji dodawania
    @Test
    public void testSumyDwochLiczbDodatnich() {
        assertThat(Calculator.add_numbers(3, 10)).isEqualTo(13);
    }

    @Test
    public void testSumyLiczbyDodatniejIUjemnej() {
        assertThat(Calculator.add_numbers(5, -3)).isEqualTo(2);
    }

    @Test
    public void testSumyDwochLiczbUjemnych() {
        assertThat(Calculator.add_numbers(-4, -6)).isEqualTo(-10);
    }

    @Test
    public void testSumyZZero() {
        assertThat(Calculator.add_numbers(0, 5)).isEqualTo(5);
    }

    // Zadanie 2: Testy dla funkcji sprawdzającej parzystość
    @Test
    public void testLiczbaParzysta() {
        assertThat(Calculator.is_even(4)).isTrue();
        assertThat(Calculator.is_even(10)).isTrue();
        assertThat(Calculator.is_even(0)).isTrue();
    }

    @Test
    public void testLiczbaNieparzysta() {
        assertThat(Calculator.is_even(3)).isFalse();
        assertThat(Calculator.is_even(7)).isFalse();
        assertThat(Calculator.is_even(-1)).isFalse();
    }

    @Test
    public void testZero() {
        assertThat(Calculator.is_even(0)).isTrue();
    }

    @Test
    public void testDuzaLiczba() {
        assertThat(Calculator.is_even(1000000)).isTrue();
        assertThat(Calculator.is_even(999999)).isFalse();
    }

    // Zadanie 3: Testy dla funkcji konwertującej temperaturę
    @Test
    public void testStandardowaTemperatura() {
        assertThat(Calculator.celsius_to_fahrenheit(0)).isEqualTo(32.0);
        assertThat(Calculator.celsius_to_fahrenheit(100)).isEqualTo(212.0);
    }

    @Test
    public void testTemperaturaUjemna() {
        assertThat(Calculator.celsius_to_fahrenheit(-10)).isEqualTo(14.0);
    }

    @Test
    public void testDuzaTemperatura() {
        assertThat(Calculator.celsius_to_fahrenheit(1000)).isEqualTo(1832.0);
    }

    @Test
    public void testTemperaturaZero() {
        assertThat(Calculator.celsius_to_fahrenheit(0)).isEqualTo(32.0);
    }

    // Zadanie 4: Testy dla funkcji obliczającej silnię
    @Test
    public void testMaleLiczby() {
        assertThat(Calculator.factorial(0)).isEqualTo(1);
        assertThat(Calculator.factorial(1)).isEqualTo(1);
        assertThat(Calculator.factorial(2)).isEqualTo(2);
    }

    @Test
    public void testDuzeLiczby() {
        assertThat(Calculator.factorial(5)).isEqualTo(120);
        assertThat(Calculator.factorial(10)).isEqualTo(3628800);
    }

    @Test
    public void testLiczbyUjemne() {
        try {
            Calculator.factorial(-1);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Liczba nie może być ujemna");
        }
    }

    @Test
    public void testWydajnosc() {
        assertThat(Calculator.factorial(20)).isEqualTo(2432902008176640000L); // Oczekiwana wartość to long
    }

    // Zadanie 5: Testy dla funkcji sprawdzającej, czy liczba jest liczbą pierwszą
    @Test
    public void testLiczbyPiersze() {
        assertThat(Calculator.is_prime(2)).isTrue();
        assertThat(Calculator.is_prime(3)).isTrue();
        assertThat(Calculator.is_prime(5)).isTrue();
        assertThat(Calculator.is_prime(7)).isTrue();
    }

    @Test
    public void testLiczbyNiePiersze() {
        assertThat(Calculator.is_prime(4)).isFalse();
        assertThat(Calculator.is_prime(6)).isFalse();
        assertThat(Calculator.is_prime(8)).isFalse();
        assertThat(Calculator.is_prime(9)).isFalse();
    }

    @Test
    public void testLiczbyMniejszeNiz2() {
        assertThat(Calculator.is_prime(0)).isFalse();
        assertThat(Calculator.is_prime(1)).isFalse();
    }

    @Test
    public void testDuzeLiczbyPiersze() {
        assertThat(Calculator.is_prime(104729)).isTrue();  // Przykład dużej liczby pierwszej
    }
}
