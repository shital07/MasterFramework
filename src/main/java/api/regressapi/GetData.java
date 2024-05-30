package api.regressapi;

import configuration.ConfigFactory;
import io.restassured.response.Response;

public final class GetData {
    static final String PATH = ConfigFactory.getAPIConfig().endurl();

    private GetData() {

    }

    public static Response getUser() {

        return BaseRequestSpecification.getDefaultRequest()
                .queryParam("page", 2).get(PATH);


    }
}
