package twitchanalyticsservicebackend.analyticsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.InMemoryReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;

public class TwitchWebClient {

    @Bean
    ReactiveClientRegistrationRepository getRegistration(
            @Value("${spring.security.oauth2.client.registration.twitch.client-id}") String clientId,
            @Value("${spring.security.oauth2.client.registration.twitch.client-secret}") String clientSecret
    ) {
        ClientRegistration registration = ClientRegistration
                .withRegistrationId("twitch")
                .clientId(clientId)
                .clientSecret(clientSecret)
                .authorizationGrantType(AuthorizationGrantType.CLIENT_CREDENTIALS)
                .build();
        return new InMemoryReactiveClientRegistrationRepository(registration);
    }
}
