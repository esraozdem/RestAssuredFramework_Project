package testtrigger;

import testcases.TC1;
import testcases.TC2;
import testcases.TC3;

public class Trigger {

    public static void main(String[] args) {
        System.out.println("Executing Test case 1- get() request");
        TC1 tc1 = new TC1();
        tc1.getRequestTest();

        System.out.println("Executing Test case 2- post() request");
        TC2 tc2 = new TC2();
        tc2.postRequestTest();
        System.out.println("Executing Test case 3- delete() request");
        TC3 tc3 = new TC3();
        tc3.deleteRequestTest();

    }
}
