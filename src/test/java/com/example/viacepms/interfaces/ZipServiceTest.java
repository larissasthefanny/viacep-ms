package com.example.viacepms.interfaces;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.RestDocsRestAssuredConfigurationCustomizer;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;



@WebMvcTest
public class ZipServiceTest {

    @Autowired
    private ZipService zipService;

    @Test
    public void mustReturnSucess(){

    }
}
