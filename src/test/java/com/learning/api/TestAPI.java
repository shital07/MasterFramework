package com.learning.api;

import api.regressapi.GetData;
import api.regressapi.PostData;
import api.regressapi.pojo.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestAPI {

    @Test
    public void testGetMethod() {


        Response users = GetData.getUser();
        int statusCode = users.statusCode();
        System.out.println(users.asPrettyString());
        Assertions.assertThat(statusCode).isEqualTo(200);

    }

    @Test
    public void createData() throws IOException {
       // Employee builder = Employee.builder().name("shital malviya").job("SDET").build();

        Response response = PostData.postUser();
        int statusCode = response.statusCode();
        Assertions.assertThat(statusCode).isEqualTo(201);
        System.out.println(response.asPrettyString());

    }
}
