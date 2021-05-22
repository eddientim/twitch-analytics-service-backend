package twitchanalyticsservicebackend.analyticsservice.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopGamesRequest {

    private String id;
    private String name;
}
