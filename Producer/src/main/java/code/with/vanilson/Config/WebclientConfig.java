package code.with.vanilson.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebclientConfig {

    @Bean
    public WebClient.Builder builder() {
        return WebClient.builder();
    }
}
