package testcases;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import payloads.Person;
import testresponsevalidation.ResponseValidations;
import teststeps.HttpMethods;
import testutilities.ConfigurationReader;

public class TC3 {
    @Test
    public void deleteRequestTest() {
        HttpMethods http = new HttpMethods();

        Response response = http.deleteRequest(ConfigurationReader.getProperty("url1"), "QisCdiw");

        ResponseValidations.responseStatusLineCodeVal(200,response);


}}
