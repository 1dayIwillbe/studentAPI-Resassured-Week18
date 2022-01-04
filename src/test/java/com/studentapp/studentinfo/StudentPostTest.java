package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;


public class StudentPostTest extends TestBase {

    @Test
    public void createStudent() {
        List <String> coursesList = new ArrayList<>();
        coursesList.add("Java");
        coursesList.add("Selenium");


        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Jignesh");
        studentPojo.setLastName("Patel");
        studentPojo.setEmail("jigneshPM1@hotmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(coursesList);

        Response response =given().header("Content-Type","application/json")
                .body(studentPojo).when().post();
                response.then().statusCode(201);
                response.prettyPrint();

    }
}
