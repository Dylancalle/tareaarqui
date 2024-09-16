import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "es") String lang) {
        Locale locale = new Locale(lang);
        return greetingService.getGreeting(locale);
    }

    @GetMapping("/greeting/personalized")
    public String personalizedGreeting(@RequestParam String name, @RequestParam(defaultValue = "es") String lang) {
        Locale locale = new Locale(lang);
        return greetingService.getPersonalizedGreeting(name, locale);
    }
}
