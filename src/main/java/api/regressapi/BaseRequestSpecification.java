package api.regressapi;

import configuration.ConfigFactory;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public final class BaseRequestSpecification {
    private BaseRequestSpecification() {

    }

    static final String BASEURL = ConfigFactory.getAPIConfig().baseurl();

    public static RequestSpecification getDefaultRequest() {
        return RestAssured.given().baseUri(BASEURL).log().all();
    }


}
