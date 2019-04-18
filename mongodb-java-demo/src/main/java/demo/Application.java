package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static String MONGODB_CONNECTION_STRING = "mongodb+srv://sophiaqin:mongo@cluster0-tgs4c.mongodb.net/test?retryWrites=true";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
