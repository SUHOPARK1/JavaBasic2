package hello;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    HelloWorld h = new HelloWorld();

    @Test
    public void main() {
        assertEquals("Hello, World !!!!", h.main());
        // Arrays.asList("Hello, World!!!!").stream().forEach(System.out::println);
    }

}
