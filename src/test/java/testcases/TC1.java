package testcases;

import io.restassured.response.Response;
import testresponsevalidation.ResponseValidations;
import teststeps.HttpMethods;
import testutilities.ConfigurationReader;
import testutilities.ParsingMethod;

public class TC1 {

    public void getPersonRequest() {
        HttpMethods http = new HttpMethods();
        Response response = http.getRequest(TC2.JsonKeyValue, ConfigurationReader.getProperty("url1"));

        ResponseValidations.responseStatusLineCodeVal(200,response);

        String ParseData = ParsingMethod.jsonResDataParsing(response, "firstName");
        System.out.println(ParseData);
        ResponseValidations.responseDataValid("Beck", ParseData);
        System.out.println(response.asString()+ "\n");

    }

    public void getAllPeopleRequest() {
        HttpMethods http = new HttpMethods();
        Response response = http.getRequest(ConfigurationReader.getProperty("url1"));
        ResponseValidations.responseStatusLineCodeVal(200, response);
        System.out.println(response.asString() + "\n");
    }

}
