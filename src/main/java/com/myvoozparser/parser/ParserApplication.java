package com.myvoozparser.parser;

import com.myvoozparser.controllers.Parser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class ParserApplication {

    public static void main(String[] args) {
        try {
            Parser.executePostRequest();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        SpringApplication.run(ParserApplication.class, args);
    }

}
