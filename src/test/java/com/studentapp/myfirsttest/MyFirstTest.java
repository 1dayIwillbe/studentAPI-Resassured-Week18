package com.studentapp.myfirsttest;


import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class MyFirstTest extends TestBase {
    @Test
    public void getAllStudentInfo(){
        Response response = given()
                .when()
                .get("/list");
                response.then().statusCode(200);
                response.prettyPrint();

    }

}
