package twitchanalyticsservicebackend.analyticsservice.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class GetUserInfoTest {

    @Test
    @DisplayName("GetUserTest_TestEndpoint")
    void getUserTest() {
        //Given
        String userInfo = new GetUserInfo().getHello();

        //Then
        assertEquals(userInfo, "hello world!!");
    }
}
