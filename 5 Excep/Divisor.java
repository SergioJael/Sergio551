package divisor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Divisor divisor = new Divisor();
        try {
            double resultado = divisor.dividir();
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número válido.");
        }
    }

    public double dividir() throws ArithmeticException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dividendo:");
        double dividendo = scanner.nextDouble();
        System.out.println("Ingrese el divisor:");
        double divisor = scanner.nextDouble();
        scanner.close();
        if (divisor == 0) {
            throw new ArithmeticException();
        }
        return dividendo / divisor;
    }
}
