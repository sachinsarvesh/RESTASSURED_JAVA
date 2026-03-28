import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Test_POST {

    @Test
    public void test_01(){

//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "Sachin");
//        map.put("job", "SDET");
//
//        System.out.println(map);

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
                contentType("application/json").

        when().
                post("https://reqres.in/api/users").
        then().
                statusCode(201);
    }
}
