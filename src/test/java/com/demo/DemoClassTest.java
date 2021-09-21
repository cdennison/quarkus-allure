package com.demo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class DemoClassTest {

    @Test
    @Description("test Hello Endpoint")
    public void testHelloEndpoint() {
        stepMethod();
    }

    @Step("Demo Step calling end point")
    public void stepMethod(){
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy Reactive"));
    }

}