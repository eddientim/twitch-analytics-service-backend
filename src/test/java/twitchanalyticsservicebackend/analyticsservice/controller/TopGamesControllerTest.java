package twitchanalyticsservicebackend.analyticsservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TopGamesControllerTest {

    @Autowired
    MockMvc mockMvc;

    private final String BASE_URL = "/top-games";


    @Test
    public void shouldReturnSuccessfulResponseTest() throws Exception {

        mockMvc.perform(
                get(BASE_URL + "/all-games")
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());

    }
}
