package testcases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import payloads.Person;
import testresponsevalidation.ResponseValidations;
import teststeps.HttpMethods;
import testutilities.ConfigurationReader;
import testutilities.ParsingMethod;

public class TC4 {


    public void putRequest() throws JsonProcessingException {

        Response response = new HttpMethods().getRequest(TC2.JsonKeyValue,ConfigurationReader.getProperty("url1"));
        Person person = new ObjectMapper().readValue(response.asString(),Person.class);
        person.setAge(30);
        person.setFirstName("Ahmet");

        String finalURI = ConfigurationReader.getProperty("url1") + "/" + TC2.JsonKeyValue;
        HttpMethods http = new HttpMethods();
        response = http.putRequest(person, finalURI);

        ResponseValidations.responseStatusLineCodeVal(200,response);

        String updatedData= ParsingMethod.jsonResDataParsing(response,"age");
        System.out.println("The value of Updated Json Key fecthed is :"+updatedData);
        ResponseValidations.responseDataValid("30", updatedData);

        System.out.println(response.asString());

    }

}