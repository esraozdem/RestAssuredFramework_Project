package testcases;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import testresponsevalidation.ResponseValidations;
import teststeps.HttpMethods;
import testutilities.ConfigurationReader;

public class TC3 {
    @Test
    public void deleteRequestTest() {
        HttpMethods http = new HttpMethods();

        Response response = http.deleteRequest(TC2.JsonKeyValue, ConfigurationReader.getProperty("url1"));

        ResponseValidations.responseStatusLineCodeVal(200, response);
        System.out.println("Data deleted successfully: " + response.getStatusCode());



}}
