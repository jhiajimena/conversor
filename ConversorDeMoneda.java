import java.io.IOException;

public class ConversorDeMoneda {


    public static void main(String[] args) throws IOException, InterruptedException {
        double resultado= 0;
        double monto = 1;
        ConverterService converterService = new ConverterService();
        resultado = converterService.convert("USD", "ARS", monto);
        System.out.printf("%.2f Dólares son %.2f Pesos argentinos\n", monto, resultado);
    }
}
