package spotify.api.tests;

import io.restassured.http.ContentType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spotify.api.config.ApiSpotifyConfig;
import spotify.api.token.GetToken;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTests {

    @Test
    @DisplayName("Получение ответа 200 от запроса к сайту")
    public void testGetRequestReturns200() {
        given()
                .header("Authorization", "Bearer " + GetToken.ACCESS_TOKEN)
                .when()
                .get(ApiSpotifyConfig.ENDPOINT_URL + "/me")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }

    @Test
    @DisplayName("Проверка авторизации пользователя")
    public void testAuthorizedUserGetsUserInfo() {
        given()
                .header("Authorization", "Bearer " + GetToken.ACCESS_TOKEN)
                .when()
                .get(ApiSpotifyConfig.ENDPOINT_URL + "/me")
                .then().log().all()
                .assertThat()
                .body("id", equalTo(ApiSpotifyConfig.EXPECTED_USER_ID))
                .body("display_name", equalTo(ApiSpotifyConfig.EXPECTED_DISPLAY_NAME))
                .statusCode(200)
                .extract()
                .response();
    }

}
