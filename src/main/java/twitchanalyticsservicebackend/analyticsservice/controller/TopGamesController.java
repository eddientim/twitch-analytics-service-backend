package twitchanalyticsservicebackend.analyticsservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;


@RequestMapping("/top-games")
@RestController
public class TopGamesController {

    @GetMapping("/all-games")
    public ResponseEntity<HttpStatus> getAllGames() {
        return new ResponseEntity<>(OK);
    }
}
