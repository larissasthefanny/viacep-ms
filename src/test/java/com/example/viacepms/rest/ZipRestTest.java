package com.example.viacepms.rest;

import com.example.viacepms.interfaces.ZipService;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

@WebMvcTest
public class ZipRestTest {

    @Autowired
    private ZipRest zipRest;

    @MockBean
    private ZipService zipService;

    @BeforeEach
    public void setup(){
        standaloneSetup(this.zipRest);
    }

    @Test
    public void mustRetornSuccess(){

        given()
                .accept(ContentType.JSON)
        .when()
                .get("/viacep/{cep}", 58073208)
        .then()
                .statusCode(HttpStatus.SC_OK)
        ;
    }
}
