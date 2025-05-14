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
    }
}