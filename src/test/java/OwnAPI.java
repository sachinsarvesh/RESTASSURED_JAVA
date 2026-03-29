//  https://github.com/typicode/json-server
//  npm install -g json-server
//  json-server --watch db.json

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class OwnAPI {

    @Test
    public void test_get(){
        baseURI = "http://localhost:3000/";

        given().
                param("name","John").
                get("/users").
        then().
                statusCode(200).
                log().all();
    }

    @Test
    public void test_post(){
        baseURI = "http://localhost:3000/";

        JSONObject request = new JSONObject();
        request.put("subjectId",2);
        request.put("name","vikram");
        request.put("role","dev");

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

    @Test
    public void test_patch(){
        baseURI = "http://localhost:3000/";

        JSONObject request = new JSONObject();
        request.put("name","vishwa");


        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
        when().
                patch("/users/4").
        then().
                statusCode(200).
                log().all();
    }

    @Test
    public void test_put(){
        baseURI = "http://localhost:3000/";

        JSONObject request = new JSONObject();
        request.put("subjectId",3);
        request.put("name","mani");
        request.put("role","devops");


        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
        when().
                put("/users/4").
        then().
                statusCode(200).
                log().all();
    }

    @Test
    public void test_delete(){
        baseURI = "http://localhost:3000/";

        when().
                delete("/users/4").
        then().
                statusCode(200).
                log().all();
    }

}
