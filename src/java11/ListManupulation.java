package java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ListManupulation {

    public static void  httpClientExample() throws URISyntaxException, IOException, InterruptedException {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://www.example.com"))
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        }

    public static void varExample() {
            var message = "Hello, Java 11!";
            System.out.println(message);

            var numbers = new int[]{1, 2, 3, 4, 5};
            for (var number : numbers) {
                System.out.print(number + " ");
            }
        }

        public static void stringMethodsExample() {
            String multilineString = "This is\na multiline\nstring";
            System.out.println("Is blank: " + multilineString.isBlank());

            String stringWithLeadingWhitespace = "   Java 11   ";
            System.out.println("Strip: " + stringWithLeadingWhitespace.strip());
        }
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        varExample();
        httpClientExample();
        stringMethodsExample();
    }
    }
