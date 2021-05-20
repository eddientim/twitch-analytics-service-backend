package twitchanalyticsservicebackend.analyticsservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TopGames {

    private String id;
    private String name;
    private List<String> pagination;
    private String games;



}
