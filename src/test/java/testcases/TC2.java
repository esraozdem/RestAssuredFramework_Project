package testcases;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import payloads.Person;
import testresponsevalidation.ResponseValidations;
import teststeps.HttpMethods;
import testutilities.ConfigurationReader;
import testutilities.ParsingMethod;

public class TC2 {
    static String JsonKeyValue;


    public void postRequestTest() {
        HttpMethods http = new HttpMethods();
        Person person = new Person("Beck", "Ars",20);
        Response response = http.postRequest(person,ConfigurationReader.getProperty("url1"));

        ResponseValidations.responseStatusLineCodeVal(201, response);
        response.prettyPrint();

        JsonKeyValue = ParsingMethod.jsonResDataParsing(response,"id");
       System.out.println("id: " + JsonKeyValue);







    }

}
