import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class GreetingService {

    private final MessageSource messageSource;

    public GreetingService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getGreeting(Locale locale) {
        return messageSource.getMessage("greeting", null, locale);
    }

    public String getPersonalizedGreeting(String name, Locale locale) {
        return messageSource.getMessage("greeting", null, locale) + ", " + name;
    }
}
