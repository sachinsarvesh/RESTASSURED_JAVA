import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DataDrivenTests extends DataProviders {


    @Test(dataProvider = "sampleData" )
    public void test_post(String name, String role, int subjectId){
        baseURI = "http://localhost:3000/";

        JSONObject request = new JSONObject();
        request.put("subjectId",subjectId);
        request.put("name",name);
        request.put("role",role);

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post("/users").
        then().
                statusCode(201).
                log().all();
    }

    @Parameters({"userId"})
    @Test
    public void test_delete(int userId){
        baseURI = "http://localhost:3000/";

        when().
                delete("/users/" + userId).
                then().
                statusCode(200).
                log().all();
    }


}
