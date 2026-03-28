import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test_PATCH {

    @Test
    public void test_01(){

        JSONObject request = new JSONObject();
        request.put("name", "Sachin");
        request.put("job", "SDET");

        given().
                header("x-api-key", "reqres_b25c3b72c98c4dc3b489978908d2775b").
                header("Content-Type", "application/json").
//                either header or contenttype
//                contentType("application/json").
        body(request.toJSONString()).
                accept("application/json").
        when().
                patch("https://reqres.in/api/users/2").
        then().
                statusCode(200).log().all();
    }
}
