package com.studentapp.studentinfo;


import com.studentapp.model.StudentPojo;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentPutTest {
    @Test
    public void putStudentData(){

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Rahul");
        studentPojo.setLastName("Shah");
        studentPojo.setEmail("rahulShah@gmail.com");
        studentPojo.setProgramme("Developer");

        Response response = given()
                .header("Content-Type","application/Json")
                .pathParam("id",101)
                .body(studentPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}
