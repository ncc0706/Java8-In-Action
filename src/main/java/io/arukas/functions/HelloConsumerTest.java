package io.arukas.functions;

public class HelloConsumerTest {

    public static void main(String[] args) {

        String result = helloConsumer((message) -> {
            return "Hello " + message;
        }, "world.");

        System.out.println(result);

    }

    public static String helloConsumer(HelloConsumer<String> helloConsumer, String message) {
        return helloConsumer.accept(message);
    }

}
