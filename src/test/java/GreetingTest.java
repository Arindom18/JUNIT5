
import org.junit.jupiter.api.*;

import java.net.SocketOption;


class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All - Called only Once");
    }

    @BeforeEach
    void setUp(){
        System.out.println("--Before Each Called ");
         greeting = new Greeting();
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld1() {
        System.out.println(greeting.helloWorld("Bhavya"));
    }

    @AfterEach
    void tearDown(){
        System.out.println("AfterEach");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("After All - Called only Once");
    }

}