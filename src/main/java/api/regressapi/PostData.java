package api.regressapi;

import api.regressapi.pojo.Employee;
import api.regressapi.testdata.UserTestData;
import configuration.ConfigFactory;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;

public class PostData {

    static final String PATH = ConfigFactory.getAPIConfig().endurl();
    public static Response postUser() throws IOException {

        Employee userData =(Employee) UserTestData.getUserData();
        return BaseRequestSpecification.getDefaultRequest().
        contentType(ContentType.JSON).body(userData).post(PATH);
    }
}
