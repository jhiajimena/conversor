import java.io.IOException;
import java.util.Scanner;

public class ConversorDeMoneda {


    public static void main(String[] args) throws IOException, InterruptedException {

        //ConverterService
        Scanner scanner = new Scanner(System.in);
        ConverterService converterService = new ConverterService();

        int opcion;
        do {
            System.out.println("*******************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar => Nuevos soles");
            System.out.println("2) Nuevos soles => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el valor que se desee convertir: ");
                double monto = scanner.nextDouble();
                double resultado = 0;

                try {
                    switch (opcion) {
                        case 1:
                            resultado = converterService.convert("USD", "PEN", monto);
                            System.out.printf("El valor %.2f [USD] corresponde al valor final de =>>> %.2f [PEN]\n", monto, resultado);
                            break;
                        case 2:
                            resultado = converterService.convert("PEN", "USD", monto);
                            System.out.printf("El valor %.2f [PEN] corresponde al valor final de =>>> %.2f [USD]\n", monto, resultado);
                            break;
                        case 3:
                            resultado = converterService.convert("USD", "BRL", monto);
                            System.out.printf("El valor %.2f [USD] corresponde al valor final de =>>> %.2f [BRL]\n", monto, resultado);
                            break;
                        case 4:
                            resultado = converterService.convert("BRL", "USD", monto);
                            System.out.printf("El valor %.2f [BRL] corresponde al valor final de =>>> %.2f [USD]\n", monto, resultado);
                            break;
                        case 5:
                            resultado = converterService.convert("USD", "COP", monto);
                            System.out.printf("El valor %.2f [USD] corresponde al valor final de =>>> %.2f [COP]\n", monto, resultado);
                            break;
                        case 6:
                            resultado = converterService.convert("COP", "USD", monto);
                            System.out.printf("El valor %.2f [COP] corresponde al valor final de =>>> %.2f [USD]\n", monto, resultado);
                            break;
                    }
                } catch (IOException | InterruptedException e) {
                    System.out.println("Ocurrió un error al realizar la conversión. Por favor, intente de nuevo.");
                }
            } else if (opcion != 7) {
                System.out.println("Opción inválida. Por favor intente de nuevo.");
            }

        } while (opcion != 7);

        System.out.println("Gracias por usar el Conversor de Moneda. Hasta luego!");
        scanner.close();
    }
}

