package twitchanalyticsservicebackend.analyticsservice.service;

import org.springframework.stereotype.Service;
import twitchanalyticsservicebackend.analyticsservice.models.TopGames;
import twitchanalyticsservicebackend.analyticsservice.models.TopGamesResponse;

import java.util.Optional;

@Service
public class GamesService {

    private TopGames topGames;
    private TopGamesResponse TopGamesResponse;

    public void getTopGames() {
    }

    private Optional<TopGamesResponse> checkForTopPlayingGames(String id, String name) {

        return Optional.ofNullable(TopGamesResponse);
    }

}
