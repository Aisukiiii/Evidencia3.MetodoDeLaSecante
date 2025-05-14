import java.util.Scanner;

public class MetodoSecante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //funcion (E^2) - x - x
        System.out.println("Ingrese el valor de X0:");
        double x0 = scanner.nextDouble();
        System.out.println("Ingrese el valor de X1:");
        double x1 = scanner.nextDouble();
        System.out.println("Ingrese el número de iteraciones a realizar:");
        int iteraciones = scanner.nextInt();
        double xi = x1;
        for (int i = 0; i < iteraciones; i++) {
            double fx0 = Math.exp(-x0) - x0;
            double fx1 = Math.exp(-x1) - x1;
            double fxi = x1 - (fx1 * (x0 - x1)) / (fx0 - fx1);
            double ErrorPorcentual = 0;
            if (i > 0) {
                ErrorPorcentual = Math.abs((fxi - xi) / fxi) * 100;
            }
            System.out.println("\nIteración " + (i + 1) + ":");
            System.out.printf("x0 = %.10f\n", x0);
            System.out.printf("x1 = %.10f\n", x1);
            System.out.printf("f(x0) = %.10f\n", fx0);
            System.out.printf("f(x1) = %.10f\n", fx1);
            System.out.printf("xi+1 = %.10f\n", fxi);

            if (i > 0) {
                System.out.printf("Error porcentual = %.10f%%\n", ErrorPorcentual);
            }
            xi = fxi;
            x0 = x1;
            x1 = fxi;
        }
    }
}