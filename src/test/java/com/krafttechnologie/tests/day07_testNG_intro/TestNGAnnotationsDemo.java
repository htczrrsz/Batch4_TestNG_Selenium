package com.krafttechnologie.tests.day07_testNG_intro;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo {


    @BeforeMethod
    public void setUp() {
        System.out.println("** Open Browser **");
    }


    @AfterMethod
    public void tearDown() {
        System.out.println("** Close Browser **");
    }


    @Test
    public void test1() {
        System.out.println("First Assertions");
        Assert.assertEquals("Title","Title");

        System.out.println("Second Assertion");
        Assert.assertEquals("url","url");
    }

    @Test
    public void test2() {
        System.out.println("Third Assertion");
        Assert.assertEquals("test2","test2");
    }

    @Test
    public void test3() {
        String expectedTitle="Kraft";
        String actualTitle="Krafttech";
        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"verify that title starting Kraft");
    }

    @Test
    public void test4() {
//        verify that email contains "@" sign
        String email= "krafttech@study.com";
//
//        if (actualUrl.equals(expectedUrl)){
//            System.out.println("pass");
//        }else{
//            System.out.println("fail");
//        }


        Assert.assertTrue(email.contains("@"));
    }

    @Test
    public void test5() {
        Assert.assertFalse(0>1,"verify that = is not greater than 1");
    }

    @Test
    public void test6() {
        Assert.assertNotEquals("two","one");
    }




}
