package testcases;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testresponsevalidation.ResponseValidations;
import teststeps.HttpMethods;
import testutilities.ConfigurationReader;

import java.lang.reflect.Type;

public class TC1 {

    public void getRequestTest() {
        HttpMethods http = new HttpMethods();
        Response response = http.getRequest(ConfigurationReader.getProperty("url1"));
        ResponseValidations.responseStatusLineCodeVal(200,response);
    }}
