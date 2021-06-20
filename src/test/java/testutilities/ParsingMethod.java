package testutilities;

import io.restassured.response.Response;

public class ParsingMethod {

    public static String jsonResDataParsing(Response response, String jsonPath) {

        String jsonParseKeyValue = response.jsonPath().get(jsonPath).toString();
        return jsonParseKeyValue;
    }
}
