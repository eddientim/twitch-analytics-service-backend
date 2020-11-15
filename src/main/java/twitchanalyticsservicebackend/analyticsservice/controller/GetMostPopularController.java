package twitchanalyticsservicebackend.analyticsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class GetMostPopularController {

    @GetMapping("/id")
    public String getHello() {
        return "hello world!!";
    }
}
