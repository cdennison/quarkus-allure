package com.demo;

import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Step;


public class NonQuarkusTest {

    @Test
    @Description("test Some")
    public void testSome() {
        testNormal();
    }

    @Step("Demo Working Step")
    public void testNormal(){
        //Some Code
    }

}