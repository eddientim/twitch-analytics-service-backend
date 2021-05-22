package twitchanalyticsservicebackend.analyticsservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.util.UriTemplate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopGamesResponse {

    private String id;
    private String name;
    private List<String> pagination;
    private UriTemplate boxArtUrl;

}
