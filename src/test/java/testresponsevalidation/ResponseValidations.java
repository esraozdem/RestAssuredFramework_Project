package testresponsevalidation;

import io.restassured.response.Response;
import org.testng.Assert;


public class ResponseValidations {
//    public void responseValidation(Response response){
//        System.out.println(response.statusLine());
//        System.out.println(response.asString());
//    }


    public static  void responseStatusLineCodeVal(int ExpStatCode, Response response) {

        Assert.assertEquals(response.getStatusCode(), ExpStatCode );
    }
    public static void responseStatusLineCodeVal(String ExpData , String actualData ) {

        Assert.assertEquals(ExpData, actualData);
    }

    public static void responseDataValid(String ExpData, String ActualData) {
        Assert.assertEquals(ExpData,ActualData);
    }





}
