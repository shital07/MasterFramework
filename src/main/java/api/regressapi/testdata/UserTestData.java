package api.regressapi.testdata;

import api.regressapi.pojo.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public final class UserTestData {

    private UserTestData(){

    }

    public static Object getUserData() throws IOException {
      return new ObjectMapper().readValue(new File(System.getProperty("user.dir") +
                "/src/test/resources/data.json"), Employee.class);

    }


}
