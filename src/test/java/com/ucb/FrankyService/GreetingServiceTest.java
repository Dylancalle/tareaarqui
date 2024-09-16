import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void testGreetingInSpanish() {
        assertEquals("Saludos", greetingService.getGreeting(new Locale("es")));
    }

    @Test
    public void testGreetingInEnglish() {
        assertEquals("Hello", greetingService.getGreeting(new Locale("en")));
    }

    @Test
    public void testPersonalizedGreetingInSpanish() {
        assertEquals("Saludos, Juan", greetingService.getPersonalizedGreeting("Juan", new Locale("es")));
    }

    @Test
    public void testPersonalizedGreetingInEnglish() {
        assertEquals("Hello, John", greetingService.getPersonalizedGreeting("John", new Locale("en")));
    }
}
