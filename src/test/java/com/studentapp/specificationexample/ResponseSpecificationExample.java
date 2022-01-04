package com.studentapp.specificationexample;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ResponseSpecificationExample {


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
    }

    @Test
    public void test001() {
        given().log().all()
                .header("Content-Type", "application/json")
                .queryParam("$limit", 2)
                .when()
                .get("/products")
                .then()
                .statusCode(200)
                .log().all();

    }

    @Test
    public void test002() {
        given().log().all()
                .header("Content-Type", "application/json")
                .queryParam("$limit", 2)
                .when()
                .post("/products/1")
                .then()
                .statusCode(200)
                .log().all();
    }

}
