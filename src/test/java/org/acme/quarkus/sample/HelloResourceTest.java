package org.acme.quarkus.sample;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HelloResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello-forum")
                .then()
                .statusCode(200);
        /* commented out because response can wary during demos
                     .body(is("hello"));
         */
    }

}