package testtrigger;

import com.fasterxml.jackson.core.JsonProcessingException;
import testcases.TC1;
import testcases.TC2;
import testcases.TC3;
import testcases.TC4;

public class Trigger {

    public static void main(String[] args) throws JsonProcessingException {
//
//        System.out.println("Executing Test Case 1- get() request");
        TC1 tc1 = new TC1();
//        tc1.getAllPeopleRequest();

        System.out.println("Executing Test Case 2- post() request");
        TC2 tc2 = new TC2();
        tc2.postRequestTest();

        System.out.println("Executing Test Case 1- get() request");
        tc1.getPersonRequest();

//        System.out.println("Executing Test Case 1- get() request");
//        tc1.getAllPeopleRequest();
//
        System.out.println("Executing Test Case 4- get() request");
        TC4 tc4 = new TC4();
        tc4.putRequest();
//
//        System.out.println("Executing Test Case 1- get() request");
//        tc1.getAllPeopleRequest();
//
//        System.out.println("Executing Test Case 3- delete() request");
//        TC3 tc3 = new TC3();
//        tc3.deleteRequestTest();
//
//        System.out.println("Executing Test Case 1- get() request");
//        tc1.getAllPeopleRequest();


    }
}