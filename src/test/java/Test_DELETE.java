import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test_DELETE {

    @Test
    public void test_01(){

        given().
                header("x-api-key", "reqres_b25c3b72c98c4dc3b489978908d2775b").
        when().
                delete("https://reqres.in/api/users/2").
        then().
                statusCode(204).log().all();
    }
}
