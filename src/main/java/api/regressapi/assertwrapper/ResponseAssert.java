package api.regressapi.assertwrapper;

import io.restassured.response.Response;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

public class ResponseAssert extends AbstractAssert<ResponseAssert, Response> {


    private SoftAssertions softAssertions;

    private ResponseAssert(Response response) {
        super(response, ResponseAssert.class);
        softAssertions = new SoftAssertions();
    }

    public static ResponseAssert asserThat(Response response) {
        return new ResponseAssert(response);
    }


    public ResponseAssert assertStatusCode(int statuscode) {

        softAssertions.assertThat(actual.getStatusCode()).isEqualTo(statuscode);
        return this;
    }


    public ResponseAssert assertResponseBody(Class clazz) {
        softAssertions.assertThat(actual.as(clazz));

        return this;
    }
}
