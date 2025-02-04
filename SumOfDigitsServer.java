import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SumOfDigitsServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new SumOfDigitsHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Server started on port 8000");
    }

    static class SumOfDigitsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "<html><body>" +
                    "<form method='GET'>" +
                    "Enter the number: <input type='text' name='num'>" +" <br>" +
                    "<input type='submit' value='Calculate'>" +
                    "</form>";

            String query = t.getRequestURI().getQuery();
            if (query != null && query.contains("num=")) {
                String numStr = query.split("=")[1];
                int num = Integer.parseInt(numStr);
                int sum = 0;

                while (num > 0) {
                    int digit = num % 10;
                    sum += digit;
                    num /= 10;
                }

                response += "<p>Sum of the digits is: " + sum + "</p>";
            }

            response += "</body></html>";

            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}