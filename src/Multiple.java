import java.util.stream.Stream;

public class Multiple {
    public static void main(String[] args) {


        Stream.iterate(0, number -> number + 1)
                .filter(number -> number < 1000)
                .filter(number -> number % 3 == 0)
                .filter(number -> number % 5 == 0)
                .limit(1000);
                .mapToInt(number -> number.intValue())
                .sum();
    }
}
