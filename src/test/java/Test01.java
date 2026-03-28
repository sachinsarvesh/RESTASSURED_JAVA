import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Test01 {

    @Test
    void test_01(){

        Response response = RestAssured
                .given()
                .header("x-api-key", "reqres_b25c3b72c98c4dc3b489978908d2775b")
                .get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());

    }

    @Test
    void test_02(){
        given()
                .header("x-api-key", "reqres_b25c3b72c98c4dc3b489978908d2775b")
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.id[0]",equalTo(8));
    }
}
