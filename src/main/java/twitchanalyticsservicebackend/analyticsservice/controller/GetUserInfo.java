package twitchanalyticsservicebackend.analyticsservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/hello")
@RestController
public class GetUserInfo {

    @GetMapping("/id")
    public String getHello() {
        return "hello world!!";
    }
}
