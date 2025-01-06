import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConverterService {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/09c10d546eee9b67bf767a76/latest/USD";
    private final HttpClient httpClient;
    private final Gson gson;

    public ConverterService() {
        this.httpClient = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public double convert(String fromCurrency, String toCurrency, double amount) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);

        if ("success".equals(jsonResponse.get("result").getAsString())) {
            JsonObject rates = jsonResponse.getAsJsonObject("conversion_rates");
            double fromRate = rates.get(fromCurrency).getAsDouble();
            double toRate = rates.get(toCurrency).getAsDouble();
            return (amount / fromRate) * toRate;
        } else {
            throw new IOException("Error al obtener las tasas de conversión");
        }
    }
}
