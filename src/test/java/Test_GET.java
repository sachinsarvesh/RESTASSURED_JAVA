import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static java.lang.Math.log;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class Test_GET {

    @Test
    public void test_01(){
        given().
                header("x-api-key", "reqres_b25c3b72c98c4dc3b489978908d2775b").
                get("https://reqres.in/api/users/2").
        then().
                statusCode(200).
                log().all();
//                body("data.id[1]",equalTo(8)).
//                body("data.first_name", hasItems("Michael", "Lindsay", "Tobias" ));
    }
}
