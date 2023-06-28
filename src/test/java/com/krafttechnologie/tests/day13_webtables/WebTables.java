package com.krafttechnologie.tests.day13_webtables;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTables {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://webdriveruniversity.com/Data-Table/index.html");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void printTable() {
//       print whole table
        WebElement table = driver.findElement(By.xpath("//table[@id='t01']"));

        System.out.println("table.getText() = " + table.getText());
    }

    @Test
    public void getAllHeaders() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='t01']//th"));
//       number of columns
        System.out.println("headers.size() = " + headers.size());
//       print all of them
        for (WebElement header : headers) {
            System.out.println("header.getText() = " + header.getText());
        }

    }

    @Test
    public void printTableSize() {
//       number of rows with header
        List<WebElement> rowsWithHeader = driver.findElements(By.xpath("//table[@id='t01']//tr"));
        System.out.println("rowsWithHeader.size() = " + rowsWithHeader.size());
//        for (WebElement webElement : rowsWithHeader) {
//            System.out.println("webElement.getText() = " + webElement.getText());
//        }
        List<WebElement> rowsWithoutHeader = driver.findElements(By.xpath("//table[@id='t01']//td/.."));
        System.out.println("rowsWithoutHeader.size() = " + rowsWithoutHeader.size());


    }


    @Test
    public void getRow() {
//   print the second row

        WebElement secondRow = driver.findElement(By.xpath("(//table[@id='t01']//td/..)[2]"));
        System.out.println("secondRow.getText() = " + secondRow.getText());

//        get all rows dynamically and print them one by one (without header)
        List<WebElement> rowsWithoutHeader = driver.findElements(By.xpath("//table[@id='t01']//td/.."));
        for (WebElement webElement : rowsWithoutHeader) {
            System.out.println("webElement.getText() = " + webElement.getText());
        }


//       get all rows dynamically and print them one by one (without header)
        for (int i = 1; i <= rowsWithoutHeader.size(); i++) {
            WebElement element = driver.findElement(By.xpath("(//table[@id='t01']//td/..)[" + i + "]"));
            System.out.println("element.getText() = " + element.getText());
        }

    }


    @Test
    public void getAllCellInOneRow() {
//       get all cell of first row
        List<WebElement> allCellsInOneRow = driver.findElements(By.xpath("(//table[@id='t01']//td/..)[1]/td"));
        for (WebElement webElement : allCellsInOneRow) {
            System.out.println("webElement.getText() = " + webElement.getText());
        }


    }


    @Test
    public void getASingleCellInOneRow() {
//       get the third cell of first row --> 45
        WebElement thirdCell = driver.findElement(By.xpath("(//table[@id='t01']//td/..)[1]/td[3]"));
        System.out.println("thirdCell.getText() = " + thirdCell.getText());


        WebElement secondCellOfSecondRow = driver.findElement(By.xpath("(//table[@id='t01']//td/..)[2]/td[2]"));
        System.out.println("secondCellOfSecondRow.getText() = " + secondCellOfSecondRow.getText());
    }


    @Test
    public void printAllCellsByIndex() {
//       we would like to write a code that it will print all cells one by one

        int rowNumber = getNumberOfRows();
        int columnNumber = getNumberOfColumns();

        for (int i = 1; i <= rowNumber; i++) {
            for (int j = 1; j <= columnNumber; j++) {
                WebElement element = driver.findElement(By.xpath("(//table[@id='t01']//td/..)[" + i + "]/td[" + j + "]"));
                System.out.println(i + "/" + j + "--> "  +  element.getText());
            }
        }

    }

    private int getNumberOfRows() {
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='t01']//td/.."));
        int rowNumber = rows.size();
        return rowNumber;
    }

    private int getNumberOfColumns() {
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='t01']//th"));
        int columnNumber = columns.size();
        return columnNumber;
    }




//here is the method that we aimed for reach during the whole evening
   private  WebElement getSpecificCell(int row, int column){
        WebElement element= driver.findElement(By.xpath("(//table[@id='t01']//td/..)["+row + "]/td["+column+"]"));
        return element;
   }

   @Test
    public void test(){
//        verify that value of 3rd row and 2nd cell is "Doe"
       WebElement targetElement= getSpecificCell(3,2);
       String actual= targetElement.getText();
       String expected= "Doe";
       Assert.assertEquals(actual,expected);
//       System.out.println("getSpecificCell(3,2).getText() = " + getSpecificCell(3, 2).getText());
   }




}
